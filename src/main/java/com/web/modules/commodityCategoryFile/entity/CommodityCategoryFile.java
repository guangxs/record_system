package com.web.modules.commodityCategoryFile.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "commodity_category_file")
@ApiModel(value = "商品档案")
public class CommodityCategoryFile {
    @ApiModelProperty(value = "商品名")
    private String commodityName;
    @ApiModelProperty(value = "类型")
    private String categoryName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品ID")
    private String commodityId;
    @ApiModelProperty(value = "商品规格")
    private String commoditySpecifications;
    @ApiModelProperty(value = "计量单位")
    private String unitOfMeasurement;
    @ApiModelProperty(value = "状态码")
    private String conditionCode;
    @ApiModelProperty(value = "仓库的价格")
    private Double warehousingPrice;
    @ApiModelProperty(value = "仓库交货价格")
    private Double exWarehousingPrice;
    @ApiModelProperty(value = "库存上限")
    private Long inventoryCap;
    @ApiModelProperty(value = "库存地板")
    private Long inventoryFloor;
    @ApiModelProperty(value = "开放数量")
    private Long openingQuantity;
    @ApiModelProperty(value = "平均开放指数")
    private Double averageOpening;
    @ApiModelProperty(value = "备注")
    private String remarks;
    @ApiModelProperty(value = "仓库名称")
    private String warehouseName;
}
