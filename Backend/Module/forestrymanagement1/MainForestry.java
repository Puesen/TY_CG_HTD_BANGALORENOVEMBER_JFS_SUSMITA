package com.capgimini.forestrymangement1.admin.main;

import java.util.Scanner;

import com.capgimini.forestrymanagement1.admin.contract.Contract;
import com.capgimini.forestrymanagement1.admin.customer.Customer;
import com.capgimini.forestrymanagement1.admin.product.Product;

public class MainForestry {//creating a class
	public static void main(String[] args) {//creating a main method
		Scanner sc=new Scanner(System.in);
		try {
		char ch='y';
		while(ch=='y'||ch=='y') {//check value is true or not
			System.out.println("------------------ FORESTRY MANAGMENT SYSTEM----------------------");
			System.out.println("            HOME");
			System.out.println("Press 1 if you are a contractor");
			System.out.println("Press 2 if you are a customer");
			System.out.println("Press 3 if you are looking for a product");
			int choose=sc.nextInt();

			//create one switch case
			switch (choose) {
			//case 1 for contractor 
			case 1:
				Contract c=new Contract();
				c.contractor();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
				//case 2 for customer
			case 2:
				Customer cu=new Customer();
				cu.customer();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
				//case 3 for product
			case 3:
				Product p=new Product();
				p.product();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			default:
				System.err.println("Insert valid input 1-3");
				MainForestry m= new MainForestry();
				m.main(null);
				}//end of of switch case
		}//end of while loop
		
		}catch(Exception e) {
			System.err.println("Please Enter number");
			MainForestry.main(null);
		}
	}//end of main method

}//end of class
