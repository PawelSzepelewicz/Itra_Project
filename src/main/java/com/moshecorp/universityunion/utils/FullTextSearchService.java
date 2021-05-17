package com.moshecorp.universityunion.utils;

import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.model.company.News;
import com.moshecorp.universityunion.repository.company.CompanyPhotoRepository;
import com.moshecorp.universityunion.service.CompanyPreviewService;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import com.moshecorp.universityunion.service.company.CompanyService;
import com.moshecorp.universityunion.service.company.RatingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Slf4j
@RequiredArgsConstructor
public class FullTextSearchService {

    private final EntityManager entityManager;
    private final FullTextIndexingService service;
    private final CompanyPreviewService companyPreviewService;
    private final CompanyService companyService;

    public Set<CompanyPreview> searchInfoBySearchText(String searchRequest){
        try {
            service.initiateIndexing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<Company> companySet = getCompanySetBasedOnWord(searchRequest);
        Set<Comments> commentsSet = getCommentSetBasedOnWord(searchRequest);
        Set<News> newsSet = getNewsSetBasedOnWord(searchRequest);

        Set<CompanyPreview> companyPreviews = new HashSet<>();

        companySet.forEach(company -> {
            companyPreviews.add(companyPreviewService.getCompanyPreviewFromCompany(company));
        });
        commentsSet.forEach(comment -> {
            Company company = companyService.getById(comment.getCompanyId());
            companyPreviews.add(companyPreviewService.getCompanyPreviewFromCompany(company));
        });
        newsSet.forEach(record -> {
            Company company = companyService.getById(record.getCompanyId());
            companyPreviews.add(companyPreviewService.getCompanyPreviewFromCompany(company));
        });
        return companyPreviews;
    }

    private Set<Company> getCompanySetBasedOnWord(String word){
        FullTextEntityManager fullTextEntityManager =
                Search.getFullTextEntityManager(entityManager);

        QueryBuilder qb = fullTextEntityManager
                .getSearchFactory()
                .buildQueryBuilder()
                .forEntity(Company.class)
                .get();

        Query companyQuery = qb.keyword()
                .onFields("name","description")
                .matching(word)
                .createQuery();

        FullTextQuery fullTextQuery = fullTextEntityManager
                .createFullTextQuery(companyQuery, Company.class);
        return new HashSet<>((List<Company>) fullTextQuery.getResultList());
    }

    private Set<Comments> getCommentSetBasedOnWord(String word){
        FullTextEntityManager fullTextEntityManager =
                Search.getFullTextEntityManager(entityManager);

        QueryBuilder qb = fullTextEntityManager
                .getSearchFactory()
                .buildQueryBuilder()
                .forEntity(Comments.class)
                .get();

        Query commentQuery = qb.keyword()
                .onFields("text")
                .matching(word)
                .createQuery();

        FullTextQuery fullTextQuery = fullTextEntityManager
                .createFullTextQuery(commentQuery, Comments.class);
        return new HashSet<>((List<Comments>) fullTextQuery.getResultList());
    }

    private Set<News> getNewsSetBasedOnWord(String word){
        FullTextEntityManager fullTextEntityManager =
                Search.getFullTextEntityManager(entityManager);

        QueryBuilder qb = fullTextEntityManager
                .getSearchFactory()
                .buildQueryBuilder()
                .forEntity(News.class)
                .get();

        Query newsQuery = qb.keyword()
                .onFields("title", "content")
                .matching(word)
                .createQuery();

        FullTextQuery fullTextQuery = fullTextEntityManager
                .createFullTextQuery(newsQuery, News.class);
        return new HashSet<>((List<News>) fullTextQuery.getResultList());
    }
}
