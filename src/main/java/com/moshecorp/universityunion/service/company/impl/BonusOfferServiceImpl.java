package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.repository.company.BonusOfferRepository;
import com.moshecorp.universityunion.service.company.BonusOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BonusOfferServiceImpl implements BonusOfferService {

    @Autowired
    BonusOfferRepository bonusOfferRepository;

    @Override
    public void saveBonusOffer(BonusOffer bonusOffer) { //utw
        bonusOfferRepository.save(bonusOffer);
    }

    @Override
    public BonusOffer getById(Long id) {     //utw
        return bonusOfferRepository.getById(id);
    }

    @Override
    public List<BonusOffer> getAllByCompanyId(Long companyId) {
        return bonusOfferRepository.getAllByCompanyId(companyId);
    }
}
