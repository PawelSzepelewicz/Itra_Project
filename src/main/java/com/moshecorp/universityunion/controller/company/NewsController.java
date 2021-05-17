package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.NewsCreation;
import com.moshecorp.universityunion.model.company.News;
import com.moshecorp.universityunion.service.company.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController()
@RequestMapping("/company/news")
@AllArgsConstructor
public class NewsController {

    @Autowired
    private final NewsService service;

    @PostMapping("/register")
    public News create(@RequestBody NewsCreation newsCreation) {  //utw
        return service.createNews(newsCreation);
    }

    @PostMapping(value = "/savePhoto/{id}", consumes = "multipart/form-data") //utw
    public void saveNewsPhoto(@RequestBody MultipartFile newsPhoto, @PathVariable("id") Long newsId) {
        service.sendPhotoToCloudStorage(newsPhoto, newsId);
    }

    @PostMapping("/change")
    public News changeUiSettings(@RequestBody News news) {  //utw
        return service.changeNews(news);
    }

    @GetMapping("/getAll")
    public List<News> getAllByCompanyId(@RequestBody Long companyId) {  //utw
        return service.getAllByCompanyId(companyId);
    }

}
