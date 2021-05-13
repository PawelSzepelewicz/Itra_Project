package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.BonusOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BonusOfferRepository extends JpaRepository<BonusOffer, Long> {

    BonusOffer getById(Long id);

    @Query(value = "select companyId from BonusOffer where id = :id")
    Long getCompanyIdById(Long id);

    @Query(value = "select title from BonusOffer where id = :id")
    String getTitleById(Long id);

    @Query(value = "select description from BonusOffer where id = :id")
    String getDescriptionById(Long id);

    @Query(value = " select bonusSum from BonusOffer where id = :id")
    Double getBonusSumById(Long id);

//    List<BonusOffer> getAllByCompanyId(Long companyId);
//
//    @Query(value = "select companyId from BonusOffer where id= :id")
//    Long getCompanyIdById(@Param("id") Long id);
//
//    @Query(value = "select title from BonusOffer where companyId = :companyId")
//    List<BonusOffer> getBonusOfferTitlesByCompanyId(@Param("companyId") Long companyId);

}
