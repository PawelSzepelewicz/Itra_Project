package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.BonusOffer;

public interface BonusOfferService {

    void saveBonusOffer(BonusOffer bonusOffer); //utw

    BonusOffer getById(Long id); //utw

}
