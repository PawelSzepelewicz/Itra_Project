package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.Company;

import java.util.List;

public interface CompanyService {

    Company getById(Long id);

    List<Company> getAllByCategoryId(Long categoryId);

    Company saveNewCompany(Company company);  // utw

//    List<Company> getAllByUserId(Long userId);
//
//    String getNameById(Long id);
//
//    List<String> getNameByUserId(Long userId);
//
//    List<Company> getAllByCategory(Categories category);
//
//    List<String> getNameByCategory(Categories category);
//
//    List<Company> getNameListOrderByDate(Pageable paging);
//
//    Double getTargetSumById(Long id);
//
//    Double getCurrentSumById(Long id);
//
//    Timestamp getExpirationDateById(Long id);
//
//    Timestamp getCreationDateById(Long id);

}
