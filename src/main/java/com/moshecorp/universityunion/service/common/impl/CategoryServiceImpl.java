package com.moshecorp.universityunion.service.common.impl;

import com.moshecorp.universityunion.model.common.Category;
import com.moshecorp.universityunion.repository.common.CategoryRepository;
import com.moshecorp.universityunion.service.common.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategoriesList() {  //utw
        return categoryRepository.findAll();
    }

    @Override
    public String getCategoryNameById(Long id) { //utw
        return categoryRepository.getById(id).getCategoryName();
    }
}
