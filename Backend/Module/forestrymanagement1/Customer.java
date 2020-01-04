package com.capgimini.forestrymanagement1.admin.customer;

import java.util.Scanner;

import com.capgimini.forestrymanagement1.admin.contract.ContractBean;
import com.capgimini.forestrymanagement1.admin.contract.ContractDAO;
import com.capgimini.forestrymanagement1.admin.contract.DAOManager;
import com.capgimini.forestrymangement1.admin.main.MainForestry;

//create one class
public class Customer {
	public void customer() {// create one method

		CustomerBean bean = new CustomerBean();// create one CustomerBean object
		CustomerDAO dao = CustomerDAOManager.getCustomerDAO();// create one CustomerDAO object
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {// create one while loop
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to get all data");
			System.out.println("Enter 4 to update the data");
			System.out.println("Enter 5 to return home");

			int choice = sc.nextInt();// create one variable
			// create one switch case pass the choice variable
			switch (choice) {
			// Add details of customer
			case 1:
				CustomerBean bean1 = new CustomerBean();
				System.out.println("Enter Customer Id.........");
				int customerid = sc.nextInt();

				bean1.setCustomerid(customerid);
				boolean again;

				do { 
					System.out.println("Enter Customer Name........");

					String customername=sc.next(); 
					if(customername.matches("[A-Z][a-z]*"))
					{
						System.out.println("Valid Customer Name");
						bean1.setCustomername(customername);
						again=true; 
					}

					else{
						System.out.println("Invalid Customer Name Please try again........");
						again=false;

					} 
				}while(!again);



				do {
					System.out.println("Enter 6 digit postalcode...");
					String postalCode = sc.next();

					if (postalCode.matches("[1-9]{1}[0-9]{5}")) {
						System.out.println("Valid Customer Id");
						bean1.setPostalCode(postalCode);
						again = true;
					}

					else {
						System.out.println("Invalid Customer Id Please try again........");
						again = false;

					}
				} while (!again);

				System.out.println("Enter streetaddress1...");
				String streetAddress1 = sc.next();
				System.out.println("Enter streetaddress2...");
				String streetAddress2 = sc.next();
				System.out.println("Enter town...");
				String town = sc.next();

				do {
					System.out.println("Enter Your EmailID......");
					String email = sc.next();

					if (email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
						System.out.println("Valid Email Id");
						bean1.setEmail(email);
						again = true;
					}

					else {
						System.out.println("Invalid Email Id Please try again........");
						again = false;

					}
				} while (!again);

				do {
					System.out.println("Enter telephoneno...");
					String telephoneno = sc.next();

					if(telephoneno.matches("[0-9]{3}{1}[0-9]{3}{1}[0-9]{4}")){
						System.out.println("Valid Contract Number");
						bean1.setTelephoneNo(telephoneno);
						again=true;
					}

					else{
						System.out.println("Invalid Contract Number Please try again........");
						again=false;

					}      
				}while(!again);




				bean1.setStreetAddress1(streetAddress1);
				bean1.setStreetAddress2(streetAddress2);
				bean1.setTown(town);

				// check if customer id is present in the list customer details are not added
				// else customer details are added to the list
				boolean check = dao.addCustomer(bean1);
				if (check) {
					System.out.println("customer details added to the list");
				} else {
					System.out.println("customerid is repeated");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);
				break;
				// case 2 is for deleting customer details
			case 2:
				System.out.println("Enter customerid to delete");
				int customerid3 = sc.nextInt();
				if (dao.deleteCustomer(customerid3)) {

					System.out.println("given customerid details has been deleted");
				} else {
					System.out.println("sorry....Unable to deleted");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);

				break;
				// case 3 for search customer details by using customer id
			case 3:
				System.out.println(dao.getAllCustomers());

				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);

				break;
				// case 5 for update customer
			case 4:

				int custId=0;
				boolean dao2=dao.modifyCustomer(custId);
				if(dao2) {
					System.out.println("Modified Successfully");
				}else {
					System.out.println("Something Went wrong");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);
				break;
				/*
				 * System.out.println("Enter customerid to update"); int customerid4 =
				 * sc.nextInt(); CustomerBean beans = new CustomerBean();
				 * System.out.println("Enter customername to update");
				 * beans.setCustomername(sc.next());
				 * System.out.println("Enter streetaddress1 to update");
				 * beans.setStreetAddress1(sc.next());
				 * System.out.println("Enter streetaddress2 to update");
				 * beans.setStreetAddress2(sc.next());
				 * System.out.println("Enter town to update"); beans.setTown(sc.next());
				 * System.out.println("Enter postalCode to update");
				 * beans.setPostalCode(sc.next()); System.out.println("Enter email to update");
				 * beans.setEmail(sc.next()); System.out.println("Enter telephoneno to update");
				 * beans.setTelephoneNo(sc.next()); boolean check1 =
				 * dao.modifyCustomer(customerid4); if (check1) {
				 * System.out.println("customer details updated successfully...."); } else {
				 * System.out.println("Unable to update the customer details...!!!"); }
				 */

				// case 4 for go back to main menu
			case 5:
				MainForestry m = new MainForestry();
				m.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);
				break;
				// if we choose other then 1-6 one message will display
			default:
				System.out.println("Your choice should be 1-5");
				Customer c=new Customer();
				c.customer();
				break;
			}// end of switch case

		} // end of while loop

	}// end of customer()

}// end of class
