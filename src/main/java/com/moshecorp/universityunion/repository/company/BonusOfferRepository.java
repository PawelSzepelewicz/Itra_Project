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

    List<BonusOffer> getAllByCompanyId(Long companyId);  //utw

}
