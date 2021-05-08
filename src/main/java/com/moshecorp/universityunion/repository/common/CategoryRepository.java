package com.moshecorp.universityunion.repository.common;

import com.moshecorp.universityunion.model.common.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category getById(Long id);

}
