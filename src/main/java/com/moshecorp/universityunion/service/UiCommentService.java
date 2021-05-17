package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;

import java.util.List;

public interface UiCommentService {

    List<UiComment> getUiCommentsList(UserAndCompanyIds ids);  //utw

}
