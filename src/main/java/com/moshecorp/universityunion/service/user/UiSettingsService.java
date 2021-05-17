package com.moshecorp.universityunion.service.user;

import com.moshecorp.universityunion.model.UserRole;
import com.moshecorp.universityunion.model.user.UiSettings;

public interface UiSettingsService {

    UiSettings changeUiSettings(UiSettings uiSettings);  //utw

    void changeRole(UserRole userRole); //utw

}
