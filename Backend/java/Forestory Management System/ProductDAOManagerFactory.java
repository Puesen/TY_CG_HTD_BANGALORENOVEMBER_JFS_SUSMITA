package com.capgimini.fms.app;

import com.capgimini.fms.dao.ProductDAO;
import com.capgimini.fms.dao.ProductDAOImpl;

public class ProductDAOManagerFactory {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl();
		
	}
}