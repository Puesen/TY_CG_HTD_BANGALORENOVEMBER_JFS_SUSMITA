package com.capgimini.forestrymanagementjdbc.admin.product;

import java.util.List;

public interface ProductService {
	public List<ProductBean> getAllProductss() ;
	public boolean deleteProduct(int prodid);
	public boolean addProduct(ProductBean bean);
	boolean modifyProduct(ProductBean bean);
}//end of interface
