package com.moshecorp.universityunion.repository.common;

import com.moshecorp.universityunion.model.common.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagsRepository extends JpaRepository<Tag, Long> {

    Tag getByTag(String tag); // utw

    @Query(value = "select * from tags where tags.tag like :start limit 5", nativeQuery = true)
    List<Tag> getTagsByTagStartingWith(@Param("start") String start); //utw

}
