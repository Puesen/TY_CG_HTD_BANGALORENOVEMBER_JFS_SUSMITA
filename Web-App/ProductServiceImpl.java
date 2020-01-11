package com.capgimini.Web.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgimini.Web.App.dao.ProductDAO;
import com.capgimini.Web.App.dto.Product;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	 private ProductDAO dao;
	@Override
	public boolean addProduct(Product bean) {
		return dao.addProduct(bean);
	}

	@Override
	public Product searchProduct(int id) {
		return dao.searchProduct(id);
	}

}
