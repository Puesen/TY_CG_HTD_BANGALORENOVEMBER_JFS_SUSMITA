package com.cap.fmsjdbc.admin.customer;

import java.util.Scanner;

import com.cap.fmsjdbc.admin.main.Forestry;


public class Customer {
public void customer() {
		
		CustomerBean bean=new CustomerBean();
		CustomerDAO dao=DAOManagerFactory.getCustomerDAO();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='Y'||ch=='y') {
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to search data");
			System.out.println("Enter 4 to get all data");
			System.out.println("Enter 5 to update the data");
			System.out.println("Enter 6 to return home");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter customerid...");
				int customerid=sc.nextInt();
				System.out.println("Enter customername...");
				String customername=sc.next();
				System.out.println("Enter streetaddress1...");
				String streetAddress1=sc.next();
				System.out.println("Enter streetaddress2...");
				String streetAddress2=sc.next();
				System.out.println("Enter town...");
				String town=sc.next();
				System.out.println("Enter postalcode...");
				int postalCode=sc.nextInt();
				System.out.println("Enter email...");
				String email=sc.next();
				System.out.println("Enter telephoneno...");
				long telephoneno=sc.nextLong();
				CustomerBean bean1=new CustomerBean();
				bean1.setCustomerid(customerid);
				bean1.setCustomername(customername);
				bean1.setStreetAddress1(streetAddress1);
				bean1.setStreetAddress2(streetAddress2);
				bean1.setTown(town);
				bean1.setPostalCode(postalCode);
				bean1.setEmail(email);
				bean1.setTelephoneNo(telephoneno);

				boolean check=dao.addCustomer(bean1);
				if(check) {
					System.out.println("customer details added to the list");
				}
				else
				{
					System.out.println("customerid is repeated");
				}
				
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter customerid to delete");
				int customerid3=sc.nextInt();
				if(dao.deleteCustomer(customerid3)) {
				
					System.out.println("given customerid details has been deleted");
				}
				else {
					System.out.println("sorry....Unable to deleted");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 3:
				System.out.println("Enter customerid to search");
				int customerid1=sc.nextInt();
				if(bean!=null)
				{
					try {
				CustomerBean bean2=dao.getCustomer(customerid1);
				System.out.println(bean2.getCustomerid());
				System.out.println(bean2.getCustomername());
				System.out.println(bean2.getStreetAddress1());
				System.out.println(bean2.getStreetAddress2());
				System.out.println(bean2.getTown());
				System.out.println(bean2.getPostalCode());
				System.out.println(bean2.getEmail());
				System.out.println(bean2.getTelephoneNo());
				}
				catch(Exception e){
					System.out.println("Check the customerid");
				}
				}
				else {
					System.out.println("customer details not found....!!!");
				}

				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);

				break;
			case 4:
//				
				System.out.println(dao.getAllCustomers());

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 5:
				System.out.println("Enter customerid to update");
				int customerid4=sc.nextInt();
				CustomerBean beans=new CustomerBean();
				System.out.println("Enter customername to update");
				beans.setCustomername(sc.next());
				System.out.println("Enter streetaddress1 to update");
				beans.setStreetAddress1(sc.next());
				System.out.println("Enter streetaddress2 to update");
				beans.setStreetAddress2(sc.next());
				System.out.println("Enter town to update");
				beans.setTown(sc.next());
				System.out.println("Enter postalCode to update");
				beans.setPostalCode(sc.nextInt());
				System.out.println("Enter email to update");
				beans.setEmail(sc.next());
				System.out.println("Enter telephoneno to update");
				beans.setTelephoneNo(sc.nextLong());
				boolean check1=dao.modifyCustomer(customerid4, beans);
				if(check1) {
					System.out.println("customer details updated successfully....");
				}
				else {
					System.out.println("Unable to update the customer details...!!!");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 6:
				Forestry m=new Forestry();
				m.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			default:
				System.out.println("Your choice should be 1-6");
				break;
			}
			
			
			
		}


		}

}
