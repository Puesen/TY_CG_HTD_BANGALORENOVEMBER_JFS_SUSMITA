package com.cap.shop.admin.factory;

import com.cap.shop.admin.dao.FlipkartDAO;
import com.cap.shop.admin.dao.FlipkartDAOImpl;

public class DAOManagerFactory {
	public static FlipkartDAO getFlipkartDAO() {
		return new FlipkartDAOImpl(); 	
	}
}
