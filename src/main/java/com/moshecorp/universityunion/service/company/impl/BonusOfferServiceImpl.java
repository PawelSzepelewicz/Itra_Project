package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.repository.company.BonusOfferRepository;
import com.moshecorp.universityunion.service.company.BonusOfferService;
import com.moshecorp.universityunion.service.user.UserBonusesService;
import com.moshecorp.universityunion.service.user.impl.UserBonusesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BonusOfferServiceImpl implements BonusOfferService {

    @Autowired
    BonusOfferRepository bonusOfferRepository;
    @Autowired
    UserBonusesService userBonuses;

    @Override
    public BonusOffer getById(Long id) {
        return bonusOfferRepository.getById(id);
    }

    @Override
    public String getTitleById(Long id) {
        return bonusOfferRepository.getTitleById(id);
    }

    @Override
    public Long getCompanyIdById(Long id) {
        return bonusOfferRepository.getCompanyIdById(id);
    }

    @Override
    public String getDescriptionById(Long id) {
        return bonusOfferRepository.getDescriptionById(id);
    }

    @Override
    public Double getBonusSumById(Long id) {
        return bonusOfferRepository.getBonusSumById(id);
    }

//    @Override
//    public List<BonusOffer> getAllByCompanyId(Long companyId) {
//        return bonusOfferRepository.getAllByCompanyId(companyId);
//    }
//
//    @Override
//    public void saveBonusOfferListToDB(List<BonusOffer> bonusOfferList) {
//        bonusOfferList.forEach(bo -> bonusOfferRepository.save(bo));
//    }
//
//    @Override
//    public void changeBonusOffer(BonusOffer bonusOffer) {
//        bonusOfferRepository.save(bonusOffer);
//    }
//
//    @Override
//    public List<BonusOffer> getBonusOfferTitlesByCompanyId(Long companyId) {
//        return bonusOfferRepository.getBonusOfferTitlesByCompanyId(companyId);
//    }

}
