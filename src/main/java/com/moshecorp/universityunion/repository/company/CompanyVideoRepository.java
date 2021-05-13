package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyVideoRepository extends JpaRepository<CompanyVideo, Long> {

    List<CompanyVideo> getAllByCompanyId(Long companyId);

    CompanyVideo getById(Long id);

}
