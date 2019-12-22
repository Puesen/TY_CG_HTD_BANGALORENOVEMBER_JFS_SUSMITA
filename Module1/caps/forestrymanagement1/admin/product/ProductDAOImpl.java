

package com.caps.forestrymanagement1.admin.product;

import java.util.HashMap;
import java.util.Map;

import com.caps.forestrymanagement1.admin.customer.CustomerBean;

public class ProductDAOImpl implements ProductDAO {
	Map<Integer,ProductBean> productbeans=new HashMap<Integer, ProductBean>();
	 int pid=0;
	@Override
	public ProductBean getAllProducts() {
		if(productbeans!=null) {
			System.out.println(productbeans);
		}
		return null;
	}

	@Override
	public boolean deleteProduct(int prodid) {
		if(productbeans!=null) {
			productbeans.remove(prodid);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		while(true) {
			++pid;
			productbeans.put(pid, bean);
			return true;
		}
	}

	@Override
	public boolean modifyProduct(int prodid, ProductBean bean) {
		productbeans.replace(prodid, bean);
		return true;
	}

	@Override
	public ProductBean getProduct(int prodid) {
		if(productbeans.containsKey(prodid)==true) {
			return productbeans.get(prodid);
		}else {
			return null;
		}
	}

}
