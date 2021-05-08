package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.News;
import com.moshecorp.universityunion.repository.company.NewsRepository;
import com.moshecorp.universityunion.service.company.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {

    NewsRepository newsRepository;

    @Override
    public List<News> getAllByCompanyId(Long id) {
        return newsRepository.getAllByCompanyId(id);
    }

    @Override
    public News getById(Long id){
        return newsRepository.getById(id);
    }

    @Override
    public News getTitleById(Long id) {
        return newsRepository.getTitleById(id);
    }

    @Override
    public List<News> getAllTitleByCompanyId(Long companyId) {
        return newsRepository.getAllTitleByCompanyId(companyId);
    }

    @Override
    public News getContentById(Long id) {
        return newsRepository.getContentById(id);
    }

    @Override
    public News getPhotoUrlById(Long id) {
        return newsRepository.getPhotoUrlById(id);
    }

    @Override
    public News getCreationDatetimeById(Long id) {
        return newsRepository.getCreationDatetimeById(id);
    }

}
