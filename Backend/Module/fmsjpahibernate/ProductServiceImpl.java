package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dao.ProductDAO;
import com.capgimini.fmsjpahibernate.dto.ProductBean;
import com.capgimini.fmsjpahibernate.factory.ProductDAOManager;

public class ProductServiceImpl implements ProductService{

	ProductDAO dao= ProductDAOManager.instanceOfProductDAOImpl();

	public List<ProductBean> getAllProductss() {
		// TODO Auto-generated method stub
		return dao.getAllProductss();
	}

	public boolean deleteProduct() {
		// TODO Auto-generated method stub
		return dao.deleteProduct();
	}

	public boolean addProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return dao.addProduct(bean);
	}

	public boolean modifyProduct() {
		// TODO Auto-generated method stub
		return dao.modifyProduct();
	}
	}
