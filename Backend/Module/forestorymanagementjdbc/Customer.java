package com.capgimini.forestrymanagementjdbc.admin.customer;

import java.util.Scanner;

import com.capgimini.forestrymanagementjdbc.admin.main.MainForestry;
import com.capgimini.forestrymanagementjdbc.admin.product.ProductBean;
import com.capgimini.forestrymanagementjdbc.admin.product.ProductDAOManager;
import com.capgimini.forestrymanagementjdbc.admin.product.ProductService;

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

					String customername = sc.next();
					if (customername.matches("[A-Z][a-z]*")) {
						System.out.println("Valid Customer Name");
						bean1.setCustomername(customername);
						again = true;
					}

					else {
						System.out.println("Invalid Customer Name Please try again........");
						again = false;

					}
				} while (!again);

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

					if (telephoneno.matches("[0-9]{3}{1}[0-9]{3}{1}[0-9]{4}")) {
						System.out.println("Valid Contract Number");
						bean1.setTelephoneNo(telephoneno);
						again = true;
					}

					else {
						System.out.println("Invalid Contract Number Please try again........");
						again = false;

					}
				} while (!again);

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
					System.out.println("sorry....Unable to delete. Customer id is not present in the list");
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

				CustomerService service=CustomerDAOManager.instanceOfCustomerServiceImpl();
				CustomerBean bean2 = new CustomerBean();
				System.out.println("Enter Customer Id for Update.........");
				bean2.setCustomerid(sc.nextInt());
				System.out.println("Enter Telephone Number to update.......");
				bean.setTelephoneNo(sc.next());
				if(service.modifyCustomer(bean2)) {
					System.out.println("Customer details updated successfully....");
				}
				else {
					System.out.println("Unable to update the Customer details...!!! Customer id doesnot match");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;

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
				Customer c = new Customer();
				c.customer();
				break;
			}// end of switch case

		} // end of while loop

	}// end of customer()

}// end of class
