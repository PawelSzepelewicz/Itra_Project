package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyVideoRepository extends JpaRepository<CompanyVideo, Long> {

    @Query(value = "select videoUrl from CompanyVideo where companyId = :companyId")
    String getVideoUrlByCompanyId(@Param("companyId") Long companyId);  //utw

}
