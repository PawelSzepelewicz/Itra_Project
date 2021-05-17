package com.moshecorp.universityunion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAndCommentIds {

    Long userId;
    Long commentId;
}
