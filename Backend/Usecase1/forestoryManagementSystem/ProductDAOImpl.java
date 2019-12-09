package com.capgimini.fms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgimini.fms.beans.CustomerBean;
import com.capgimini.fms.beans.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	private List<ProductBean> productBean=new ArrayList<ProductBean>();

	@Override
	public boolean addProduct(ProductBean bean) {
		for(ProductBean pb2 : productBean) {
			if(pb2.getProdid()==bean.getProdid()) {
				return false;
			}
		}	
		productBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteProduct(int id) {
		ProductBean bean=null;
		for(ProductBean productBean2: productBean) {
			if(productBean2.getProdid()==id) {
				bean= productBean2;

			}
		}	
		if(bean!=null) {
			productBean.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyProduct(int prodId1) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("1.Update Product Name\n 2. Update Product Description ");
			int ch=sc.nextInt();
			System.out.println("Enter the Product id to update");
			int prodId=sc.nextInt();
			switch(ch) {

			case 1:
				System.out.println("Enter the new Product Name");
				updateProdName(prodId,sc.next());
				break;
			case 2:
				System.out.println("Enter the new Product Description");
				updatePdes(prodId,sc.next());
				break;
			}
			return true;
		}		
	}
	public boolean updateProdName(int prodId, String newName) {
		for(int i=0;i<productBean.size();i++) {
			if(productBean.get(i).getProdid()==prodId) {
				productBean.get(i).setPname(newName);
			}
			return true;
		}
		return false;
	}
	public boolean updatePdes(int custId1, String pdesc) {
		for(int i=0;i<productBean.size();i++) {
			if(productBean.get(i).getProdid()==custId1) {
				productBean.get(i).setPdesc(pdesc);
			}
			return true;
		}
		return false;
	}	
}
