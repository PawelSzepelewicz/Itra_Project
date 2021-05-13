package com.moshecorp.universityunion.service.user;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.model.user.UserBonuses;

import java.util.List;

public interface UserBonusesService {

    List<BonusOffer> getBonusOfferListByUserId(Long userId);

    void setUserBonusesToDatabase(Long userId, Long bonusOfferId);

}
