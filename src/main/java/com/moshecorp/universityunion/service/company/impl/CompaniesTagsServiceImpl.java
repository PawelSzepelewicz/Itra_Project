package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.CompanyIdAndTagsList;
import com.moshecorp.universityunion.model.common.Tag;
import com.moshecorp.universityunion.model.company.CompanyTags;
import com.moshecorp.universityunion.repository.common.TagsRepository;
import com.moshecorp.universityunion.repository.company.CompaniesTagsRepository;
import com.moshecorp.universityunion.service.company.CompaniesTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompaniesTagsServiceImpl implements CompaniesTagsService {

    @Autowired
    CompaniesTagsRepository companiesTagsRepository;
    @Autowired
    TagsRepository tagsRepository;

    @Override
    public List<Long> getCompanyIdById(Long id) {
        return companiesTagsRepository.getCompanyIdById(id);
    }

    @Override
    public void saveTagsList(CompanyIdAndTagsList companyIdAndTagsList) { //utw
        List<Tag> tagList = getTagsListFromStrings(companyIdAndTagsList.getTagsList());
        List<CompanyTags> companyTagsList = getCompanyTagsFromListTags(companyIdAndTagsList.getCompanyId(), tagList);
        companiesTagsRepository.saveAll(companyTagsList);
    }

    @Override
    public void saveCompanyTagsList(List<CompanyTags> companyTagsList) { //utw
        companiesTagsRepository.saveAll(companyTagsList);
    }

    private List<Tag> getTagsListFromStrings(List<String> list){ //utw
        List<Tag> tagsList = new ArrayList<>();
        list.forEach(tg -> {
            Tag tag =  tagsRepository.getByTag(tg);
            if (tag == null) {
                tag = tagsRepository.save(new Tag(tg));
                tagsList.add(tag);
            }
        });
        return tagsList;
    }

    private List<CompanyTags> getCompanyTagsFromListTags(Long companyId, List<Tag> tagList){ //utw
        List<CompanyTags> companyTagsList = new ArrayList<>();
        tagList.forEach(tl -> {
            CompanyTags ct = new CompanyTags();
            ct.setCompanyId(companyId);
            ct.setTagId(tl.getId());
            companyTagsList.add(ct);
        });
        return companyTagsList;
    }
}
