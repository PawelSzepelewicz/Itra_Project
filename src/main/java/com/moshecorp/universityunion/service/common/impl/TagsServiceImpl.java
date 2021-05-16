package com.moshecorp.universityunion.service.common.impl;

import com.moshecorp.universityunion.model.common.Tag;
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
    public List<Tag> getAllTags() {                 //утверждено
        return tagsRepository.findAll();
    }

    @Override
    public Tag getById(Long id) {
        return tagsRepository.getById(id);
    }

    @Override
    public void saveNewTag(String tag) { //utw
        tagsRepository.save(new Tag(tag));
    }

    @Override
    public List<Tag> getTagsListStartsWith(String start) {    //utv
        return tagsRepository.getTagsByTagStartingWith(start + "%");
    }
}
