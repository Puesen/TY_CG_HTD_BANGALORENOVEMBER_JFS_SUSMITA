package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ProductBean;

public interface ProductService {
	public List<ProductBean> getAllProductss() ;
	public boolean deleteProduct();
	public boolean addProduct(ProductBean bean);
	boolean modifyProduct();

}//end of interface
