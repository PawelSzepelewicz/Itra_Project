package com.moshecorp.universityunion.service.company.impl;

import com.cloudinary.Cloudinary;
import com.moshecorp.universityunion.model.NewsCreation;
import com.moshecorp.universityunion.model.company.News;
import com.moshecorp.universityunion.repository.company.NewsRepository;
import com.moshecorp.universityunion.service.company.NewsService;
import com.moshecorp.universityunion.utils.CloudinaryCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
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
        Timestamp ts = Timestamp.from(Instant.now());
        news.setCreationDatetime(ts);
        news.setPhotoUrl(sendPhotoToCloudStorage(newsCreation.getPhotoUrl(), newsCreation.getCompanyId()));
        newsRepository.save(news);
        return news;
    }

    @Override
    public String sendPhotoToCloudStorage(MultipartFile file, Long companyId) { //utw
        Cloudinary cloudinary = new Cloudinary(new CloudinaryCredentials().getCloudinaryCredentials());
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
