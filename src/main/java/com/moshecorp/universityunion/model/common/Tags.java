package com.moshecorp.universityunion.model.common;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tags")
public class Tags extends AbstractEntity {

    private String tag;

}
