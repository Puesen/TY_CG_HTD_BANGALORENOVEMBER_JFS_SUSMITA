package com.cap.fmsjdbc.admin.product;

public interface ProductDAO {
	public ProductBean getAllProducts() ;
	public boolean deleteProduct(int prodid);
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(int prodid,ProductBean bean);
	public ProductBean getProduct(int prodid);
}

