package com.moshecorp.universityunion.service.common;

import com.moshecorp.universityunion.model.common.Tag;

import java.util.List;

public interface TagsService {

    List<Tag> getAllTags();   // утверждено

    Tag getById(Long id);

    void saveNewTag(String tag); //utw

    List<Tag> getTagsListStartsWith(String start); //utw

}
