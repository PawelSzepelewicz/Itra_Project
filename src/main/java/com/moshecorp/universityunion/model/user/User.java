package com.moshecorp.universityunion.model.user;

import com.moshecorp.universityunion.enums.Roles;
import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private Roles roles;

}
