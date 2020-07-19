package com.web.modules.categoryFile.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "category_files")
@ApiModel(value = "类别档案")
public class CategoryFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "类别ID")
    private Long categoryId;

    @ApiModelProperty(value = "类别名")
    private String categoryName;
}
