package com.moshecorp.universityunion.model.user;

import com.moshecorp.universityunion.enums.Roles;
import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "usr")
public class User extends AbstractEntity {

    private String email;
    private String publicId;
    private String password;
    private Roles roles;
    private String name;
    private String gender;
    private String locale;
}
