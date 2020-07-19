package com.web.modules.commodityCategoryFile.controller;

import com.web.modules.commodityCategoryFile.entity.CommodityCategoryFile;
import com.web.modules.commodityCategoryFile.service.CommodityCategoryFileService;
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
@Api(value = "CommodityCategoryFileController", description = "商品档案管理", tags = "CommodityCategoryFileController")
@RequestMapping("/system/CommodityCategoryFileController")
public class CommodityCategoryFileController extends BaseController<CommodityCategoryFile, String,  CommodityCategoryFileService> {

    @ResponseBody
    @ApiOperation(value = "新增或更新商品档案信息")
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public Result<?> edit(CommodityCategoryFile entity) throws Exception {
        log.info("新增或更新商品档案信息");
        return super.edit(entity, entity.getCommodityId());
    }
}
