package com.moshecorp.universityunion.repository.user;


import com.moshecorp.universityunion.model.user.UiSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UiSettingsRepository extends JpaRepository<UiSettings, Long> {
}
