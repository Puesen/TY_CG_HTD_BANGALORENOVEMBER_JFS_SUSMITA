package com.capgimini.fms.app;

import java.util.List;
import java.util.Scanner;

import com.capgimini.fms.beans.ProductBean;
import com.capgimini.fms.dao.ProductDAO;

public class ProductApp {

	public static void main(String[] args) {
		ProductDAO dao=ProductDAOManagerFactory.getProductDAO();
		Scanner sc=new Scanner(System.in);
		while (true) {

			System.out.println("Press 1 to add Product");
			System.out.println("Press 2 to delete Product");
			System.out.println("Press 3 to modify Product");

			int choice= sc.nextInt();
			switch(choice) {
			case 1:

				System.out.println("Enter Product id");
				int pid=sc.nextInt();
				System.out.println("Enter Product name");
				String pname=sc.next();

				System.out.println("Enter Product description");
				String pdesc=sc.next();


				ProductBean bean=new ProductBean();
				bean.setProdid(pid);
				bean.setPname(pname);
				bean.setPdesc(pdesc);
				boolean check=dao.addProduct(bean)
						;
				if(check) {
					System.out.println("Product added to the list");
				}else {
					System.out.println("Product id is repeted");
				}
				break;
			case 2:
				System.out.println("Enter Product id");
				int id1=sc.nextInt();
				boolean check1=dao.deleteProduct(id1);
				if(check1) {
					System.out.println("Product details deleted");
				}else {
					System.out.println("Product not deleted");
				}
				break;
			case 3:
				int prodId1=0;
				boolean dao2=dao.modifyProduct(prodId1);
				if(dao2) {
					System.out.println("Modified Successfully");
				}else {
					System.out.println("Something Went wrong");
				}
				break;

			default:System.exit(0);
			break;
			}

		}

	}
}

