package com.moshecorp.universityunion.model.user;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "usr")
public class User extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

}
