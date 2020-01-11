package com.capgimini.Web.App.service;

import com.capgimini.Web.App.dto.Product;

public interface ProductService {
	public boolean addProduct(Product bean);
	Product searchProduct(int id);
}
