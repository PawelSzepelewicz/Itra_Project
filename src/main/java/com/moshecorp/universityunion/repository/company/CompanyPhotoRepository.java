package com.moshecorp.universityunion.repository.company;


import com.moshecorp.universityunion.model.company.CompanyPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyPhotoRepository extends JpaRepository<CompanyPhoto, Long> {

    List<CompanyPhoto> getAllByCompanyId(Long companyId);

}
