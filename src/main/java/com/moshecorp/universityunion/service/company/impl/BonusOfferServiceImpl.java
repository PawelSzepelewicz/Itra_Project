package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.repository.company.BonusOfferRepository;
import com.moshecorp.universityunion.service.company.BonusOfferService;

import java.util.List;

public class BonusOfferServiceImpl implements BonusOfferService {

    BonusOfferRepository bonusOfferRepository;

    @Override
    public BonusOffer getById(Long id) {
        return bonusOfferRepository.getById(id);
    }

    @Override
    public List<BonusOffer> getAllByCompanyId(Long companyId) {
        return bonusOfferRepository.getAllByCompanyId(companyId);
    }

    @Override
    public void saveBonusOfferListToDB(List<BonusOffer> bonusOfferList) {
        bonusOfferList.forEach(bo -> bonusOfferRepository.save(bo));
    }

    @Override
    public void changeBonusOffer(BonusOffer bonusOffer) {
        bonusOfferRepository.save(bonusOffer);
    }

    @Override
    public List<BonusOffer> getBonusOfferTitlesByCompanyId(Long companyId) {
        return bonusOfferRepository.getBonusOfferTitlesByCompanyId(companyId);
    }

}
