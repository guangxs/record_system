package com.web.modules.categoryBrandFile.controller;

import com.web.modules.categoryBrandFile.entity.CategoryBrandFile;
import com.web.modules.categoryBrandFile.service.CategoryBrandFileService;
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


@Slf4j
@Controller
@CrossOrigin
@Api(value = "CategoryBrandFileController", description = "类别品牌档案管理", tags = "CategoryBrandFileController")
@RequestMapping("/system/CategoryBrandFileController")
public class CategoryBrandFileController extends BaseController<CategoryBrandFile, CategoryBrandFileService> {

    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取品牌档案列表")
    public Result<?> list() {
        log.info("获取品牌档案列表");
        return Result.ok(service.findAll());
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增或更新品牌档案信息")
    public Result<?> save(CategoryBrandFile entity) {
        log.info("新增或更新品牌档案信息");
        if (!StringUtils.isEmpty(service.findById(entity.getId()))) {
            return Result.ok("更新:" + service.update(entity));
        }
        return Result.ok("新增:" + service.save(entity));
    }


    @ApiImplicitParams({@ApiImplicitParam(name="ids",value="ID逗号分割",dataType="string", paramType = "query")})
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据ID删除品牌档案信息")
    public Result<?> delete(String ids) {
        log.info("根据ID删除品牌档案信息");
        return Result.ok("删除:" + service.deleteByIds(ids));
    }
}
