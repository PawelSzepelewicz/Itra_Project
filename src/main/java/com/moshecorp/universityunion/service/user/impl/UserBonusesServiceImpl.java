package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.model.user.UserBonuses;
import com.moshecorp.universityunion.repository.company.BonusOfferRepository;
import com.moshecorp.universityunion.repository.user.UserBonusesRepository;
import com.moshecorp.universityunion.service.company.BonusOfferService;
import com.moshecorp.universityunion.service.user.UserBonusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBonusesServiceImpl implements UserBonusesService {

    @Autowired
    UserBonusesRepository userBonusesRepository;
    @Autowired
    BonusOfferService bonusOfferService;

    @Override
    public List<BonusOffer> getBonusOfferListByUserId(Long userId) {
        List<BonusOffer> bonusOfferList = new ArrayList<>();
        List<Long> bonusOfferIds = userBonusesRepository.getBonusOfferIdByUserId(userId);
        bonusOfferIds.forEach(bonusId -> {
            BonusOffer bonusOffer = bonusOfferService.getById(bonusId);
            bonusOfferList.add(bonusOffer);
        });
        return bonusOfferList;
    }

    @Override
    public void setUserBonusesToDatabase(Long userId, Long bonusOfferId) {
        UserBonuses userBonuses = new UserBonuses();
        userBonuses.setUserId(userId);
        userBonuses.setBonusOfferId(bonusOfferId);
        userBonusesRepository.save(userBonuses);
    }
}