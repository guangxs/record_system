package com.web.modules.categoryBrandFile.entity;


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
@Table(name = "category_brand_files")
@ApiModel(value = "类别品牌档案")
public class CategoryBrandFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID")
    private Long id;
    @ApiModelProperty(value = "类别品牌名称")
    private String categoryBrandName;
    @ApiModelProperty(value = "品牌ID")
    private Long brandId;
    @ApiModelProperty(value = "类别ID")
    private Long categoryId;
    @ApiModelProperty(value = "备注")
    private String remarks;
}
