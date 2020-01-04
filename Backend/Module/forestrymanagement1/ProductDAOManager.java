package com.capgimini.forestrymanagement1.admin.product;

//create one class name ProductDAOManager
public class ProductDAOManager {
	public static ProductDAO getProductDAO() {//create one method of ProductDAO
		return new ProductDAOImpl(); 	//return ProductDAOImpl
	}
}//end of class



