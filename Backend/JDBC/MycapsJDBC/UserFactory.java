package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServiceImpl;
public class UserFactory {
private UserFactory() {
	
}

public static UserServices instanceOfUserServices() {
	UserServices services= new UserServiceImpl();
	return services;
}
public static UserDAO instanceOfUserDAOImpl() {
	UserDAO dao= new UserDAOImpl();
	return dao;
} 
}
