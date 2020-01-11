package com.capgimini.Web.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgimini.Web.App.dao.UserDAO;
import com.capgimini.Web.App.dto.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean register(User user) {
		return dao.register(user);
		
	}

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

}
