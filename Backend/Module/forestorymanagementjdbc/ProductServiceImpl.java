package com.capgimini.forestrymanagementjdbc.admin.product;

import java.util.List;

public class ProductServiceImpl implements ProductService{

	ProductDAO dao= ProductDAOManager.instanceOfProductDAOImpl();
	@Override
	public List<ProductBean> getAllProductss() {
		return dao.getAllProductss();
	}

	@Override
	public boolean deleteProduct(int prodid) {
		return dao.deleteProduct(prodid);
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		return dao.modifyProduct(bean);
	}
}
