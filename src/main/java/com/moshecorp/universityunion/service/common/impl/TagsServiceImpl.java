package com.moshecorp.universityunion.service.common.impl;

import com.moshecorp.universityunion.model.common.Tags;
import com.moshecorp.universityunion.repository.common.TagsRepository;
import com.moshecorp.universityunion.service.common.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsServiceImpl implements TagsService {

    @Autowired
    TagsRepository tagsRepository;


    @Override
    public List<Tags> getAllTags() {                 //утверждено
        return tagsRepository.findAll();
    }

    @Override
    public Tags getById(Long id) {
        return tagsRepository.getById(id);
    }

    @Override
    public void saveNewTag(String tag) { //utw
        tagsRepository.save(new Tags(tag));
    }

    @Override
    public List<Tags> getTagsListStartsWith(String start) {    //utv
        return tagsRepository.getTagsByTagStartingWith(start + "%");
    }
}
