package com.moshecorp.universityunion.service.common.impl;

import com.moshecorp.universityunion.model.common.Tags;
import com.moshecorp.universityunion.repository.common.TagsRepository;
import com.moshecorp.universityunion.service.common.TagsService;
import org.springframework.stereotype.Service;

@Service
public class TagsServiceImpl implements TagsService {

    TagsRepository tagsRepository;

    @Override
    public Tags getById(Long id) {
        return tagsRepository.getById(id);
    }
}
