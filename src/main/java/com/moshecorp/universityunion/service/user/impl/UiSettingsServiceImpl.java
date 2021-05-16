package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.model.user.UiSettings;
import com.moshecorp.universityunion.repository.user.UiSettingsRepository;
import com.moshecorp.universityunion.service.user.UiSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UiSettingsServiceImpl implements UiSettingsService {

    @Autowired
    UiSettingsRepository uiSettingsRepository;

    @Override
    public UiSettings changeUiSettings(UiSettings uiSettings) {   //utw
        return uiSettingsRepository.save(uiSettings);
    }
}
