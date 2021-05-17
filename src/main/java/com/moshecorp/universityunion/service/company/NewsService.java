package com.moshecorp.universityunion.service.company;


import com.moshecorp.universityunion.model.NewsCreation;
import com.moshecorp.universityunion.model.company.News;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface NewsService {

    News changeNews(News news); //utw

    News createNews(NewsCreation newsCreation); //utw

    String sendPhotoToCloudStorage(MultipartFile file, Long companyId); //utw

    List<News> getAllByCompanyId(Long companyId); //utw

}
