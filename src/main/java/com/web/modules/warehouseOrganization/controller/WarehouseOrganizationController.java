package com.web.modules.warehouseOrganization.controller;

import com.web.modules.warehouseOrganization.entity.WarehouseOrganization;
import com.web.modules.warehouseOrganization.service.WarehouseOrganizationService;
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
@Api(value = "WarehouseTransferorderController", description = "仓库档案管理", tags = "WarehouseTransferorderController")
@RequestMapping("/system/WarehouseTransferorderController")
public class WarehouseOrganizationController extends BaseController<WarehouseOrganization, Long,  WarehouseOrganizationService> {


    @ResponseBody
    @ApiOperation(value = "新增或更新仓库档案信息")
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public Result<?> edit(WarehouseOrganization entity) throws Exception {
        log.info("新增或更新仓库档案信息");
        return super.edit(entity, entity.getId());
    }
}
