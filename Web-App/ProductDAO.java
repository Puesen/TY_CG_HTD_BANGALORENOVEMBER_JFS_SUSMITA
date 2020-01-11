package com.capgimini.Web.App.dao;

import com.capgimini.Web.App.dto.Product;

public interface ProductDAO {
	public boolean addProduct(Product bean);
	Product searchProduct(int id);
}
