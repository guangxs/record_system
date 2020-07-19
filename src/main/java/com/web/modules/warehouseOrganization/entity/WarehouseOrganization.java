package com.web.modules.warehouseOrganization.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "warehouse_organization_files")
@ApiModel(value = "仓库档案")
public class WarehouseOrganization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID")
    private Long id;
    @ApiModelProperty(value = "仓库ID")
    private Long warehouseId;
    @ApiModelProperty(value = "仓库名")
    private String warehouseName;
    @ApiModelProperty(value = "仓库地址")
    private String warehouseAddress;
    @ApiModelProperty(value = "备注")
    private String remarks;
}

