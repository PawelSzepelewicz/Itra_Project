package com.moshecorp.universityunion.configuration;

//import com.moshecorp.universityunion.enums.Roles;
//import com.moshecorp.universityunion.model.user.User;
//import com.moshecorp.universityunion.model.user.UserPhoto;
//import com.moshecorp.universityunion.repository.user.UserPhotoRepository;
//import com.moshecorp.universityunion.repository.user.UserRepository;
//import com.moshecorp.universityunion.service.user.UserPhotoService;
//import com.moshecorp.universityunion.service.user.impl.UserPhotoServiceImpl;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.web.context.request.RequestContextListener;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.context.annotation.Bean;

import java.util.Map;
//@Configuration
//@EnableWebSecurity
//@EnableOAuth2Sso
public class WebSecurityConfig //extends WebSecurityConfigurerAdapter
{
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .antMatcher("/**")
//                .authorizeRequests().antMatchers("/", "/error**", "/js/**", "/login**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logout_suc").permitAll()
//                .and().csrf().disable();
//    }
//
//    @Bean
//    public PrincipalExtractor principalExtractor(UserRepository userDetailsRepo, UserPhotoRepository photoRepository) {
//        return map -> {
//            String id = (String) map.get("sub");
//
//            User user = userDetailsRepo.getByPublicId(id) == null ?
//                    createUserIfNotExists(map, userDetailsRepo, photoRepository) :
//                    userDetailsRepo.getByPublicId(id);
//
//            return user;
//        };
//    }
//
//    @Bean
//    public RequestContextListener requestContextListener() {
//        return new RequestContextListener();
//    }
//
//    private User createUserIfNotExists(Map<String, Object> map, UserRepository userRepository, UserPhotoRepository photoRepository) {
//        String id = (String) map.get("sub");
//        User newUser = new User();
//        newUser.setPublicId(id);
//        newUser.setName((String) map.get("name"));
//        newUser.setEmail((String) map.get("email"));
//        newUser.setGender((String) map.get("gender"));
//        newUser.setLocale((String) map.get("locale"));
//        newUser.setRoles(Roles.USER);
//        newUser.setGender("Male");
//
//        newUser = userRepository.save(newUser);
//        UserPhotoService userPhotoService = new UserPhotoServiceImpl(photoRepository);
//        userPhotoService.saveNewPhotoFromGoogle(new UserPhoto(newUser.getId(), map.get("picture")));
//
//        return newUser;
//    }
}
