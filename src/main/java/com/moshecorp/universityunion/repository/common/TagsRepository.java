package com.moshecorp.universityunion.repository.common;

import com.moshecorp.universityunion.model.common.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags, Long> {

    Tags getById(Long id);

}
