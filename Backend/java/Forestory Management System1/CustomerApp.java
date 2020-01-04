package com.capgimini.fms.app;

import java.util.List;
import java.util.Scanner;

import com.capgimini.fms.beans.CustomerBean;
import com.capgimini.fms.dao.CustomerDAO;

public class CustomerApp {

	public static void main(String[] args) {
		CustomerDAO dao=CustomerDAOManagerFactory.getCustomerDAO();
		Scanner sc=new Scanner(System.in);
		while (true) {
			
			System.out.println("Press 1 to add customer");
			System.out.println("Press 2 to delete customer");
			System.out.println("Press 3 to modify customer");
			System.out.println("Press 4 to display customer");
			
			int choice= sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Enter Customer id");
				int id=sc.nextInt();
				System.out.println("Enter Customer name");
				String name=sc.next();

				System.out.println("Enter Customer address1");
				String address1=sc.next();

				System.out.println("Enter Customer address2");
				String address2=sc.next();
				System.out.println("Enter Customer emailid");
				String email=sc.next();

				System.out.println("Enter Customer postalcode");
				int postalcode2=sc.nextInt();

				System.out.println("Enter Customer town");
				String town=sc.next();
				System.out.println("Enter Customer Telephone Number");
				int telephone=sc.nextInt();
				
				CustomerBean bean=new CustomerBean();
				bean.setId(id);
				bean.setName(name);
				bean.setAddress1(address1);
				bean.setAddress2(address2);
				bean.setEmailid(email);
				bean.setPostalcode(postalcode2);
				bean.setTelephoneno(telephone);
				
				boolean check=dao.addCustomer(bean)
;
				if(check) {
					System.out.println("Customer added to the list");
				}else {
					System.out.println("Customer id is repeted");
				}
				break;
			case 2:
				System.out.println("Enter Customer id");
				int id1=sc.nextInt();
				boolean check1=dao.deleteCustomer(id1);
				if(check1) {
					System.out.println("Employee details deleted");
				}else {
					System.out.println("not deleted");
				}
				break;
			case 3:
				break;
			case 4:
				List<CustomerBean> List=dao.getallCustomer();
				System.out.println(List);
				if(List!=null) {
				for (CustomerBean customerBean: List) {
					System.out.println(customerBean);
					
				}
				}
				break;
			default:System.exit(0);
				break;
			}

		}
		
	}
}
