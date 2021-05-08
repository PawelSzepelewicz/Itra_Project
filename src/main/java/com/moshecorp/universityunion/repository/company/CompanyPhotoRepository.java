package com.moshecorp.universityunion.repository.company;


import com.moshecorp.universityunion.model.company.CompanyPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyPhotoRepository extends JpaRepository<CompanyPhoto, Long> {

    List<CompanyPhoto> getAllByCompanyId(Long companyId);

}
