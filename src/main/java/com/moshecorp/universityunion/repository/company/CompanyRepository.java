package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company getById(Long id);

    List<Company> getAllByCategoryId(Long categoryId);

    List<Company> getAllByUserId(Long categoryId);

    @Query(value = "select id from Company")
    List<Long> getIdsList();

    @Query(value = "select * from company order by creation_date desc limit 5", nativeQuery = true)
    List<Company> getTopByCreationDate();

//Bestfull bestPractice, Hibernate, теория, one to many - many to one, spring bin, application context
}
