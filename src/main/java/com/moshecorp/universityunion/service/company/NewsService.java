package com.moshecorp.universityunion.service.company;


import com.moshecorp.universityunion.model.company.News;

import java.util.List;

public interface NewsService {

    List<News> getAllByCompanyId(Long id);

    News getById(Long id);

    News getTitleById(Long id);

    List<News> getAllTitleByCompanyId(Long companyId);

    News getContentById(Long id);

    News getPhotoUrlById(Long id);

    News getCreationDatetimeById(Long id);

}
