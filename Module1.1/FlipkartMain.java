package com.cap.shop.admin.main;

import java.util.List;
import java.util.Scanner;

import com.cap.shop.admin.bean.FlipkartBean;
import com.cap.shop.admin.bean.ProductList;
import com.cap.shop.admin.dao.FlipkartDAO;
import com.cap.shop.admin.factory.DAOManagerFactory;


public class FlipkartMain {

		public static void main(String[] args) {
			FlipkartDAO dao=DAOManagerFactory.getFlipkartDAO();
			
				Scanner sc=new Scanner(System.in);
				char ch='y';
				while(ch=='y'||ch=='y') {
				System.out.println("------------------ Online Shopping Application----------------------");
				System.out.println("            HOME");
				System.out.println("Press 1 to Show All the Products");
				System.out.println("Press 2 to Search Product");
				int choose=sc.nextInt();
				
				switch (choose) {
				case 1:
					List<FlipkartBean> List=dao.getAllProducts();
					System.out.println(List);
					if(List!=null) {
					for (FlipkartBean customerBean: List) {
						System.out.println(customerBean);
						
					}
					}
			
				default:
					break;
				
		}
		}

	}

}
