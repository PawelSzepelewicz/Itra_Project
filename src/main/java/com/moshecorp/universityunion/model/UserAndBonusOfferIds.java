package com.moshecorp.universityunion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAndBonusOfferIds {

    private Long userId;
    private Long bonusOfferId;
}
