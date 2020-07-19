package com.web.modules.categoryFile.controller;

import com.web.modules.categoryFile.entity.CategoryFile;
import com.web.modules.categoryFile.service.CategoryFileService;
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
@Api(value = "CategoryFileController", description = "类别档案管理", tags = "CategoryFileController")
@RequestMapping("/system/CategoryFileController")
public class CategoryFileController extends BaseController<CategoryFile, Long, CategoryFileService> {

    @ResponseBody
    @ApiOperation(value = "新增或更新类别档案信息")
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public Result<?> edit(CategoryFile entity) throws Exception {
        log.info("新增或更新类别档案信息");
        return super.edit(entity, entity.getCategoryId());
    }
}
