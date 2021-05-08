package com.moshecorp.universityunion.repository.comments;

import com.moshecorp.universityunion.model.comments.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

    List<Comments> getByCompanyId(Long companyId);

}
