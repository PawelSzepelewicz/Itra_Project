package com.moshecorp.universityunion.model.comments;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "likes")
public class Likes extends AbstractEntity {

    private Long userId;
    private Long commentId;

}
