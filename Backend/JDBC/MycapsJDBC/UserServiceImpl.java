package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;
public class UserServiceImpl implements UserServices{
	UserDAO dao=UserFactory.instanceOfUserDAOImpl();

	@Override
	public UserBean userLogin(String username, String password) {

		return dao.userLogin(username, password);
	}

	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public boolean updateUser(int userid, String username, String email, String password) {
		// TODO Auto-generated method stub
		return dao.updateUser(userid, username, email, password);
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InsertUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.InsertUser(user);
	}

}
