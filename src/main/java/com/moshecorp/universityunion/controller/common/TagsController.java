package com.moshecorp.universityunion.controller.common;

import com.moshecorp.universityunion.model.common.Tags;
import com.moshecorp.universityunion.service.common.TagsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/tags")
@AllArgsConstructor
public class TagsController {

    @Autowired
    TagsService service;

    @GetMapping("/get")
    List<Tags> getAllTags(){      // утверждено
        return service.getAllTags();
    }

    @PostMapping("/save")
    List<Tags> saveNewTagAndReturnAllTags(String tag){   // утверждено
        service.saveNewTag(tag);
        return service.getAllTags();
    }
}
