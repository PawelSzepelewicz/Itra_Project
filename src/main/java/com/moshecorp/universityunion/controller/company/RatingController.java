package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.BonusOffer;
import com.moshecorp.universityunion.model.company.Rating;
import com.moshecorp.universityunion.service.company.BonusOfferService;
import com.moshecorp.universityunion.service.company.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/company/rating")
@AllArgsConstructor
public class RatingController {

    @Autowired
    private final RatingService service;

    @PostMapping("/save")
    public void saveRating(@RequestBody Rating rating) { //utw
        service.saveRatingToDB(rating);
    }

}
