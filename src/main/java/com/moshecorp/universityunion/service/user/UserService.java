package com.moshecorp.universityunion.service.user;

import com.moshecorp.universityunion.model.Login;
import com.moshecorp.universityunion.model.user.UiSettings;
import com.moshecorp.universityunion.model.user.User;

import java.util.List;

public interface UserService {

   String getUserFirstNameById(Long is);  //utw

   UiSettings register(User user);   //utw

   UiSettings login(Login login);  //utw

   void block(Long userId);  //utw

   List<User> getAllUsers(); //utw

}
