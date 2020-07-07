package vn.com.oriexace.service;

import java.util.Optional;

import vn.com.oriexace.entity.User;


public interface UserService {
	
    public Optional<User> getUserWithAuthoritiesByLogin(String login);
    
}
