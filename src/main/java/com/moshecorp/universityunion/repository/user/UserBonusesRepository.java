package com.moshecorp.universityunion.repository.user;

import com.moshecorp.universityunion.model.user.UserBonuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBonusesRepository extends JpaRepository<UserBonuses, Long> {

    @Query(value = "select bonusOfferId from UserBonuses where userId = :userId")
    List<UserBonuses> getBonusOfferIdByUserId(@Param("userId") Long userId);

}
