package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.enums.Categories;
import com.moshecorp.universityunion.model.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.sql.Timestamp;
import java.util.List;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company getById(Long id);

    List<Company> getAllByCategoryId(Long categoryId);

    @Query(value = "update Company set currentSum = :currentSum + :addSum")
    void updateCurrentSum(@Param("currentSum") Double currentSum, @Param("addSum") Double addSum);

//    List<Company> getAllByCategory(Categories category);
//
//    List<Company> getAllByUserId(Long userId);
//
//    @Query(value = "select name from Company where id = :id")
//    String getNameById(@Param("id") Long id);
//
//    @Query(value = "select name from Company where userId = :userId")
//    List<String> getNameByUserId(@Param("userId") Long userId);
//
//    @Query(value = "select name from Company where category = :category")
//    List<String> getNameByCategory(@Param("category") Categories category);
//
//    @Query(value = "Select name from Company order by creationDate asc")
//    List<Company> getNameListOrderByDate(Pageable paging);
//
//    @Query(value = "select targetSum from Company where id = :id")
//    Double getTargetSumById(@Param("id") Long id);
//
//    @Query(value = "select currentSum from Company where id = :id")
//    Double getCurrentSumById(@Param("id") Long id);
//
//    @Query(value = "select expirationDate from Company where id = :id")
//    Timestamp getExpirationDateById(@Param("id") Long id);
//
//    @Query(value = "select creationDate from Company where id = :id")
//    Timestamp getCreationDateById(@Param("id") Long id);

}
