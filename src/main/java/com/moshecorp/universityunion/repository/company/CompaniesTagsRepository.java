package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.CompanyTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Repository
public interface CompaniesTagsRepository extends JpaRepository<CompanyTags, Long> {

    @Query(value = "select companyId from CompanyTags where tagId = :tagId")
    List<Long> getCompanyIdByTagId(@Param("tagId") Long tagId);

    @Query(value = "select tagId from CompanyTags where companyId = :companyId")
    List<Long> getAllTagsByCompanyId(@Param("companyId")Long companyId); //utw

}
