package com.moshecorp.universityunion.controller.common;

import com.moshecorp.universityunion.model.common.Tag;
import com.moshecorp.universityunion.service.common.TagsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/tags")
@AllArgsConstructor
public class TagsController {

    @Autowired
    TagsService service;

    @GetMapping("/get")             //utw
    List<Tag> getAllTags(){      // утверждено
        return service.getAllTags();
    }

    @PostMapping("/save")
    List<Tag> saveNewTagAndReturnAllTags(@RequestBody String tag){   // утверждено
        service.saveNewTag(tag);
        return service.getAllTags();
    }

    @PostMapping("/search")
    List<Tag> getTagsListStartsWith(@RequestBody String start){   // утверждено
        return service.getTagsListStartsWith(start);
    }

}
