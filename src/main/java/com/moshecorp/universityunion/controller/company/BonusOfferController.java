package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.service.company.BonusOfferService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/company/bonusOffer")
@AllArgsConstructor
public class BonusOfferController {

    @Autowired
    private final BonusOfferService service;

    @PostMapping("/save")
    public void setBonusOffer(@RequestBody BonusOffer bonusOffer) { //utw
        service.saveBonusOffer(bonusOffer);
    }
}
