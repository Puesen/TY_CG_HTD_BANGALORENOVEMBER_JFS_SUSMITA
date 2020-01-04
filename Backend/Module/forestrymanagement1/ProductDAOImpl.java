package com.capgimini.forestrymanagement1.admin.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//create one class of ProductDAOImpl which implements ProductDAO interface 
public class ProductDAOImpl implements ProductDAO {
	private List<ProductBean> productBean=new ArrayList<ProductBean>();//Create one array list

	//Implements all the unimplements methods of ProductDAO
	public List<ProductBean> getAllProductss() {
		return productBean;
	}

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
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {// create one while loop
			System.out.println("1.Update Product Name\n 2. Update Product Description ");
			int choice = sc.nextInt();// create one variable
			// create one switch case pass the choice variable
			switch (choice) {
			// Add details of customer
			
			case 1:
				System.out.println("Enter the Product id to update");
				int prodId=sc.nextInt();
				
				System.out.println("Enter the new Product Name");
				updateProdName(prodId,sc.next());
				break;
			case 2:
				System.out.println("Enter the Product id to update");
				int prodId11=sc.nextInt();
				
				System.out.println("Enter the new Product Description");
				updatePdes(prodId11,sc.next());
				break;
			default:
	
				System.err.println("OPPS..........Your choice should be 1-2");
			
				break;


			}


			return true;
		}
		return false;		
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



}//end of class
