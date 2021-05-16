package com.moshecorp.universityunion.model.user;

import com.moshecorp.universityunion.enums.Language;
import com.moshecorp.universityunion.enums.Theme;
import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ui_settings")
public class UiSettings extends AbstractEntity {

    private Long userId;
    private String language;
    private String theme;
    private String role;

    public UiSettings(Long userId, String language, String theme, String role) {
        this.userId = userId;
        this.language = language;
        this.theme = theme;
        this.role = role;
    }

    public UiSettings() {

    }
}
