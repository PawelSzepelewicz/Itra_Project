package com.moshecorp.universityunion.service.common;

import com.moshecorp.universityunion.model.common.Tags;

import java.util.List;

public interface TagsService {

    List<Tags> getAllTags();   // утверждено

    Tags getById(Long id);

    void saveNewTag(String tag); //utw

    List<Tags> getTagsListStartsWith(String start); //utw

}
