package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyVideoRepository extends JpaRepository<CompanyVideo, Long> {

    List<CompanyVideo> getAllByCompanyId(Long companyId);

    CompanyVideo getById(Long id);

}
