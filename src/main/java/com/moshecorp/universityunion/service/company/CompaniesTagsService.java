package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.CompanyIdAndTagsList;
import com.moshecorp.universityunion.model.common.Tag;
import com.moshecorp.universityunion.model.company.CompanyTags;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompaniesTagsService {

    List<Long> getCompanyIdById(Long id);

    void saveTagsList(CompanyIdAndTagsList companyIdAndTagsList);  //utw

    void saveCompanyTagsList(List<CompanyTags> companyTagsList); //utw

    List<Tag> getTagsByCompanyId(Long companyId);//utw

}
