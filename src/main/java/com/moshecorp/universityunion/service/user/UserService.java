package com.moshecorp.universityunion.service.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<String> getNameList();

    String getUserNameById(Long id);

}
