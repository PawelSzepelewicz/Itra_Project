package com.moshecorp.universityunion.repository.user;


import com.moshecorp.universityunion.model.user.UiSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UiSettingsRepository extends JpaRepository<UiSettings, Long> {


}
