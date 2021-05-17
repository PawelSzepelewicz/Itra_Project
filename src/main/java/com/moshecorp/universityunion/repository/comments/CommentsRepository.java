package com.moshecorp.universityunion.repository.comments;

import com.moshecorp.universityunion.model.comments.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

    List<Comments> getByCompanyIdOrderByCommentsDatetimeDesc(Long companyId);

}
