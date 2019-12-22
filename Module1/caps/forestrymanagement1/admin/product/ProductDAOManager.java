package com.caps.forestrymanagement1.admin.product;


public class ProductDAOManager {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl(); 	
	}
}



