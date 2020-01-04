package com.capgimini.fmsjpahibernate.dao;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ProductBean;

//create one interface
public interface ProductDAO {
	public List<ProductBean> getAllProductss() ;
	public boolean deleteProduct();
	public boolean addProduct(ProductBean bean);
	boolean modifyProduct();
}//end of interface

