package org.system.base.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.system.base.service.Service;
import org.system.config.reponse.Result;

@Slf4j
public class BaseController<T, ID,  S extends Service<T>> {
    /**
     * 动态 IOC代理
     */
    @Autowired
    protected S service;

    /**
     * 新增或修改
     * @param entity
     * @param id
     * @return
     * @throws Exception
     */
    public Result<?> edit(T entity, ID id) throws Exception {
        if (!StringUtils.isEmpty(service.findById(id))) {
            return Result.ok("更新:" + service.update(entity));
        }
        return Result.ok("新增:" + service.save(entity));
    }

    /**
     * 获取数据列表
     * @return
     */
    @ResponseBody
    @ApiOperation(value = "获取列表")
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public Result<?> list() {
        log.info("获取列表:");
        return Result.ok(service.findAll());
    }

    /**
     * 根据id删除，支持批量
     * @param ids
     * @return
     */
    @ResponseBody
    @ApiOperation(value = "根据ID删除信息")
    @ApiImplicitParams({@ApiImplicitParam(name="ids",value="ID逗号分割",dataType="string", paramType = "query")})
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public Result<?> delete(String ids) {
        log.info("根据ID删除信息:");
        return Result.ok("删除:" + service.deleteByIds(ids));
    }
}
