package com.caps.forestrymangement1.admin.main;

import java.util.Scanner;

import com.caps.forestrymanagement1.admin.contract.Contract;
import com.caps.forestrymanagement1.admin.customer.Customer;
import com.caps.forestrymanagement1.admin.product.Product;

public class MainForestry {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			char ch='y';
			while(ch=='y'||ch=='y') {
			System.out.println("------------------ FORESTRY MANAGMENT SYSTEM----------------------");
			System.out.println("            HOME");
			System.out.println("Press 1 if you are a contractor");
			System.out.println("Press 2 if you are a customer");
			System.out.println("Press 3 if you are looking for a product");
			int choose=sc.nextInt();
			
			
			switch (choose) {
			case 1:
				Contract c=new Contract();
				c.contractor();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 2:
				Customer cu=new Customer();
				cu.customer();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 3:
				Product p=new Product();
				p.product();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			default:
				break;
			}
	}
	}

}
