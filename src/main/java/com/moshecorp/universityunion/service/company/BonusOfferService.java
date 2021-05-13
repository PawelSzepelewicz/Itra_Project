package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.BonusOffer;

import java.util.List;

public interface BonusOfferService {

      BonusOffer getById(Long id);

      String getTitleById(Long id);

      Long getCompanyIdById(Long id);

      String getDescriptionById(Long id);

      Double getBonusSumById(Long id);

//    List<BonusOffer> getAllByCompanyId(Long id);
//
//    void saveBonusOfferListToDB(List<BonusOffer> bonusOfferList);
//
//    void changeBonusOffer(BonusOffer bonusOffer);
//
//    List<BonusOffer> getBonusOfferTitlesByCompanyId(Long companyId);

}
