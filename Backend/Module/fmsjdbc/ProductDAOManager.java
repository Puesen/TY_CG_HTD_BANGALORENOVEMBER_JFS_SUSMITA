package com.cap.fmsjdbc.admin.product;


public class ProductDAOManager {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl(); 	
	}
}



