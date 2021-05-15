package com.moshecorp.universityunion.service.common.impl;

import com.moshecorp.universityunion.model.common.Category;
import com.moshecorp.universityunion.repository.common.CategoryRepository;
import com.moshecorp.universityunion.service.common.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategoriesList() {  //utw
        return categoryRepository.findAll();
    }
}
