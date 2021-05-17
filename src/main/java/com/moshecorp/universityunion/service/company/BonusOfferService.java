package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.BonusOffer;

import java.util.List;

public interface BonusOfferService {

    void saveBonusOffer(BonusOffer bonusOffer); //utw

    BonusOffer getById(Long id); //utw

    List<BonusOffer> getAllByCompanyId(Long companyId);  //utw

}
