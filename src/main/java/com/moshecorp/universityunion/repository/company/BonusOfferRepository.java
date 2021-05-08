package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.BonusOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BonusOfferRepository extends JpaRepository<BonusOffer, Long> {

    BonusOffer getById(Long id);

    List<BonusOffer> getAllByCompanyId(Long companyId);

    @Query(value = "select companyId from BonusOffer where id= :id")
    Long getCompanyIdById(@Param("id") Long id);

    @Query(value = "select title from BonusOffer where companyId = :companyId")
    List<BonusOffer> getBonusOfferTitlesByCompanyId(@Param("companyId") Long companyId);

}
