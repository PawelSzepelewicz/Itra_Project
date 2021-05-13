package com.moshecorp.universityunion.controller.user;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.service.user.UserBonusesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/user")
@AllArgsConstructor
public class UserBonusesController {

    @Autowired
    private final UserBonusesService service;

    @PostMapping("/getBonuses")
    public List<BonusOffer> getBonusOfferListByUserId(@RequestBody Long userId) {
        return service.getBonusOfferListByUserId(userId);
    }

    @PostMapping("/setUserBonusToDB")
    public void setUserBonusesToDatabase(@RequestBody Long userId, Long bonusOfferId) {
        service.setUserBonusesToDatabase(userId, bonusOfferId);
    }
}
