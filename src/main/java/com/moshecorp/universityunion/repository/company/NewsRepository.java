package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> getAllByCompanyId(Long id);

    News getById(Long id);

    @Query(value = "select title from News where News.id = :id", nativeQuery = true)
    News getTitleById(@Param("id") Long id);

    @Query(value = "select title from News where News.company_id = :companyId", nativeQuery = true)
    List<News> getAllTitleByCompanyId(@Param("companyId") Long companyId);

    @Query(value = "select content from News where News.id = :id", nativeQuery = true)
    News getContentById(@Param("id") Long id);

    @Query(value = "select photo_url from News where News.id = :id", nativeQuery = true)
    News getPhotoUrlById(@Param("id") Long id);

    @Query(value = "select creation_datetime from News where News.id = :id", nativeQuery = true)
    News getCreationDatetimeById(@Param("id") Long id);

}
