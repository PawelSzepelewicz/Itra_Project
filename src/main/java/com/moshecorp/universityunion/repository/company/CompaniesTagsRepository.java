package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.CompanyTags;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompaniesTagsRepository extends JpaRepository<CompanyTags, Long> {

    List<CompanyTags> getAllByCompanyId(Long companyId);

    CompanyTags getById(Long id);

}
