package com.web.modules.warehouseOrganization.controller;

import com.web.modules.warehouseOrganization.entity.WarehouseOrganization;
import com.web.modules.warehouseOrganization.service.WarehouseOrganizationService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.system.base.controller.BaseController;
import org.system.config.reponse.Result;

import java.util.List;

@Slf4j
@Controller
@CrossOrigin
@Api(value = "WarehouseTransferorderController", description = "仓库档案管理", tags = "WarehouseTransferorderController")
@RequestMapping("/system/WarehouseTransferorderController")
public class WarehouseOrganizationController extends BaseController<WarehouseOrganization, WarehouseOrganizationService> {

    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取仓库档案列表")
    public Result<?> list() {
        log.info("获取仓库档案列表");
        return Result.ok(service.findAll());
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增或更新仓库档案信息")
    public Result<?> save(WarehouseOrganization entity) {
        log.info("新增或更新仓库档案信息");
        if (!StringUtils.isEmpty(service.findById(entity.getId()))) {
            return Result.ok("更新:" + service.update(entity));
        }
        return Result.ok("新增:" + service.save(entity));
    }


    @ApiImplicitParams({@ApiImplicitParam(name="ids",value="ID逗号分割",dataType="string", paramType = "query")})
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据ID删除仓库档案信息")
    public Result<?> delete(String ids) {
        log.info("根据ID删除仓库档案信息");
        return Result.ok("删除:" + service.deleteByIds(ids));
    }
}
