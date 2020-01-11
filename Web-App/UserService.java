package com.capgimini.Web.App.service;

import com.capgimini.Web.App.dto.User;

public interface UserService {
	
	public boolean register(User user);
	public User login(String email,String password);
}
