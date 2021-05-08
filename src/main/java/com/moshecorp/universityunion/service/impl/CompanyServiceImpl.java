package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.enums.Categories;
import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.repository.company.CompanyRepository;
import com.moshecorp.universityunion.service.CompanyService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.sql.Timestamp;
import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    @Override
    public List<Company> getAllByUserId(Long userId) {
        return companyRepository.getAllByUserId(userId);
    }

    @Override
    public Company getById(Long id) {
        return companyRepository.getById(id);
    }

    @Override
    public String getNameById(Long id) {
        return companyRepository.getNameById(id);
    }

    @Override
    public List<String> getNameByUserId(Long userId) {
        return companyRepository.getNameByUserId(userId);
    }

    @Override
    public List<Company> getAllByCategory(Categories category) {
        return companyRepository.getAllByCategory(category);
    }

    @Override
    public List<String> getNameByCategory(Categories category) {
        return companyRepository.getNameByCategory(category);
    }
    @Override
    public List<Company> getNameListOrderByDate(Pageable paging){
    Integer pageNo = 0;
    Integer pageSize = 10;
    String sortBy = "creationDate";
    Pageable pag = (Pageable) PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());
    List<Company> page = companyRepository.getNameListOrderByDate(pag);
    return page;
    }

    @Override
    public Double getTargetSumById(Long id) {
        return companyRepository.getTargetSumById(id);
    }

    @Override
    public Double getCurrentSumById(Long id) {
        return companyRepository.getCurrentSumById(id);
    }

    @Override
    public Timestamp getExpirationDateById(Long id) {
        return companyRepository.getExpirationDateById(id);
    }

    @Override
    public Timestamp getCreationDateById(Long id) {
        return companyRepository.getCreationDateById(id);
    }
}
