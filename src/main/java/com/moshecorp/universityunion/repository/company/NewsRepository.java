package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> getAllByCompanyId(Long id);  //utw

}
