package com.capgimini.Web.App.dao;

import com.capgimini.Web.App.dto.User;

public interface UserDAO {
	public boolean register(User user);
	public User login(String email,String password);
	
}
