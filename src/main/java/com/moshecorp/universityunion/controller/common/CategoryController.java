package com.moshecorp.universityunion.controller.common;

import com.moshecorp.universityunion.model.common.Category;
import com.moshecorp.universityunion.service.common.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("/get")
    List<Category> getAllCategories(){      // утв
        return service.getCategoriesList();
    }
}
