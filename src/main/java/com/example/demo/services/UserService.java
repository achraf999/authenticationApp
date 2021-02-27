package com.example.demo.services;

import java.util.Map;
import java.util.Optional;
 
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.example.demo.dto.LocalUser;
import com.example.demo.dto.SignUpRequest;
import com.example.demo.entities.User;
import com.example.demo.exceptions.UserAlreadyExistAuthenticationException;
 

 

public interface UserService {
 
    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
 
    User findUserByEmail(String email);
 
    Optional<User> findUserById(Long id);
 
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
