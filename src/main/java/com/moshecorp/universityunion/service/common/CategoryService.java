package com.moshecorp.universityunion.service.common;

import com.moshecorp.universityunion.model.common.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategoriesList(); // utw

    String getCategoryNameById(Long id); //utw

}
