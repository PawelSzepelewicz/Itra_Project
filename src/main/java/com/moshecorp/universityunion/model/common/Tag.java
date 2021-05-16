package com.moshecorp.universityunion.model.common;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tags")
public class Tag extends AbstractEntity {

    private String tag;

    public Tag(String tag) {  //utw
        this.tag = tag;
    }

    public Tag() { //utw
    }
}
