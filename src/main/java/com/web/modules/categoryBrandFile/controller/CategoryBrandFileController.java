package com.web.modules.categoryBrandFile.controller;

import com.web.modules.categoryBrandFile.entity.CategoryBrandFile;
import com.web.modules.categoryBrandFile.service.CategoryBrandFileService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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
public class CategoryBrandFileController extends BaseController<CategoryBrandFile, Long, CategoryBrandFileService> {


    @ResponseBody
    @ApiOperation(value = "新增或更新品牌档案信息")
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public Result<?> edit(CategoryBrandFile entity) throws Exception {
        log.info("新增或更新品牌档案信息");
        return super.edit(entity, entity.getId());
    }
}
