package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import org.springframework.web.bind.annotation.RequestBody;

public interface CompanyVideoService {

    CompanyVideo getByCompanyId(Long companyId); //utw

    String getVideoByCompanyId(Long companyId); //utw

    void saveCompanyVideo(CompanyVideo companyVideo); //utw

}
