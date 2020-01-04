package com.capgimini.forestrymanagement1.admin.product;

import java.util.List;

//create one interface
public interface ProductDAO {
	public List<ProductBean> getAllProductss() ;
	public boolean deleteProduct(int prodid);
	public boolean addProduct(ProductBean bean);
	boolean modifyProduct(int prodId1);
}//end of interface

