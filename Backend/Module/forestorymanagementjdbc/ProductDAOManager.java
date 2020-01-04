package com.capgimini.forestrymanagementjdbc.admin.product;


//create one class name ProductDAOManager
public class ProductDAOManager {
	public static ProductDAO getProductDAO() {//create one method of ProductDAO
		return new ProductDAOImpl(); 	//return ProductDAOImpl
	}

	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao= new ProductDAOImpl();
		return dao;
	   }

	public static ProductService instanceOfProductServiceImpl() {
		ProductService service=new ProductServiceImpl();
		return service;
	}
}//end of class



