package com.capgimini.fms.dao;

import java.util.List;

import com.capgimini.fms.beans.CustomerBean;
import com.capgimini.fms.beans.ProductBean;

public interface ProductDAO {
	boolean addProduct(ProductBean bean);
	boolean deleteProduct(int id);	
	boolean modifyProduct(int prodId1);
	


}
