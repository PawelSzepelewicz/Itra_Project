package com.moshecorp.universityunion.service.company.impl;

import com.cloudinary.Cloudinary;
import com.moshecorp.universityunion.model.NewsCreation;
import com.moshecorp.universityunion.model.company.News;
import com.moshecorp.universityunion.repository.company.NewsRepository;
import com.moshecorp.universityunion.service.company.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsRepository newsRepository;

    @Override
    public News changeNews(News news) {  //utw
        return newsRepository.save(news);
    }

    @Override
    public News createNews(NewsCreation newsCreation) {  // utw
        News news = new News();
        news.setCompanyId(newsCreation.getCompanyId());
        news.setTitle(newsCreation.getTitle());
        news.setContent(newsCreation.getContent());
        news.setCreationDatetime(newsCreation.getCreationDatetime());
        news.setPhotoUrl(sendPhotoToCloudStorage(newsCreation.getPhotoUrl(), newsCreation.getCompanyId()));
        newsRepository.save(news);
        return news;
    }

    @Override
    public String sendPhotoToCloudStorage(MultipartFile file, Long companyId) { //utw
        Map<String, String> credentials = new HashMap<>();
        credentials.put("cloud_name", "itracourse");
        credentials.put("api_key", "852218272247124");
        credentials.put("api_secret", "2MPV2kthcxl9bbVpf_ExI6G-Vj4");
        Cloudinary cloudinary = new Cloudinary(credentials);
        try {
            Map resultUrl = cloudinary.uploader().upload(file.getBytes(),
                    Map.of("public_id", format("company/company_%s/news/%s", companyId, file.getOriginalFilename())));
            return resultUrl.get("secure_url").toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<News> getAllByCompanyId(Long companyId) {  //utw
        return newsRepository.getAllByCompanyId(companyId);
    }
}
