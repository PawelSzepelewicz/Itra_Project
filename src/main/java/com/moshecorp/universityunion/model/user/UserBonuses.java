package com.moshecorp.universityunion.model.user;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_bonuses")
public class UserBonuses extends AbstractEntity {

    private Long userId;
    private Long bonusOfferId;

}
