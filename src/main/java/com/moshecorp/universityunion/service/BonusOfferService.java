package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.company.BonusOffer;

import java.util.List;

public interface BonusOfferService {

    BonusOffer getById(Long id);

    List<BonusOffer> getAllByCompanyId(Long id);

    void saveBonusOfferListToDB(List<BonusOffer> bonusOfferList);

    void changeBonusOffer(BonusOffer bonusOffer);

    List<BonusOffer> getBonusOfferTitlesByCompanyId(Long companyId);

}
