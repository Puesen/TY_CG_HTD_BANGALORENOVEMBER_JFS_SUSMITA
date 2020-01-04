package com.capgimini.fmsjpahibernate;

import java.util.Scanner;

import com.capgimini.fmsjpahibernate.dao.CustomerDAO;
import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.factory.CustomerDAOManager;
import com.capgimini.fmsjpahibernate.service.CustomerService;

//create one class
public class Customer {
	public void customer() {// create one method

		CustomerBean bean = new CustomerBean();// create one CustomerBean object
		CustomerDAO dao = CustomerDAOManager.getCustomerDAO();// create one CustomerDAO object
		Scanner sc = new Scanner(System.in);
	try {
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
				
				// check if customer id is present in the list customer details are not added
				// else customer details are added to the list
				boolean check = dao.addCustomer(bean1);
				
				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);
				break;
				// case 2 is for deleting customer details
			case 2:
				dao.deleteCustomer();
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
				service.modifyCustomer();
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
	}catch(Exception e) {
		System.out.println("Please enter a number");
	}
	}// end of customer()

}// end of class
