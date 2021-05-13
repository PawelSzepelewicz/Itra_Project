package com.moshecorp.universityunion.service.common.impl;

import com.moshecorp.universityunion.model.common.Category;
import com.moshecorp.universityunion.repository.common.CategoryRepository;
import com.moshecorp.universityunion.service.common.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    CategoryRepository categoryRepository;

    @Override
    public Category getCategoryName() {
        return categoryRepository.getCategoryName();
    }
}
