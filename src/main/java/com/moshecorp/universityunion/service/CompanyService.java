package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.enums.Categories;
import com.moshecorp.universityunion.model.company.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.sql.Timestamp;
import java.util.List;

public interface CompanyService {

    List<Company> getAllByUserId(Long userId);

    Company getById(Long id);

    String getNameById(Long id);

    List<String> getNameByUserId(Long userId);

    List<Company> getAllByCategory(Categories category);

    List<String> getNameByCategory(Categories category);

    List<Company> getNameListOrderByDate(Pageable paging);

    Double getTargetSumById(Long id);

    Double getCurrentSumById(Long id);

    Timestamp getExpirationDateById(Long id);

    Timestamp getCreationDateById(Long id);

}
