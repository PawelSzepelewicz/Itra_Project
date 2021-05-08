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
    private Language language;
    private Theme theme;

}
