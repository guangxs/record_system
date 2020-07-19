package com.web.modules.categoryFile.service.impl;

import com.web.modules.categoryFile.mapper.CategoryFileMapper;
import com.web.modules.categoryFile.entity.CategoryFile;
import com.web.modules.categoryFile.service.CategoryFileService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.system.base.service.impl.AbstractService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CategoryFileServiceImpl extends AbstractService<CategoryFileMapper, CategoryFile> implements CategoryFileService {

}
