package com.capgimini.fmsjpahibernate;

import java.util.Scanner;

import com.capgimini.fmsjpahibernate.dao.ProductDAO;
import com.capgimini.fmsjpahibernate.dto.ProductBean;
import com.capgimini.fmsjpahibernate.factory.ProductDAOManager;
import com.capgimini.fmsjpahibernate.service.ProductService;

//create one class
public class Product {
	public void product() {// create one method

		ProductBean bean = new ProductBean();// create one CustomerBean object
		ProductDAO dao = ProductDAOManager.getProductDAO();// create one CustomerDAO object
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
					ProductBean bean1 = new ProductBean();

					// check if customer id is present in the list customer details are not added
					// else customer details are added to the list
					boolean check = dao.addProduct(bean1);

					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);
					break;
				// case 2 is for deleting customer details
				case 2:
					dao.deleteProduct();
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);

					break;
				// case 3 for search customer details by using customer id
				case 3:
					System.out.println(dao.getAllProductss());

					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);

					break;
				// case 5 for update customer
				case 4:

					ProductService service = ProductDAOManager.instanceOfProductServiceImpl();
					service.modifyProduct();
						
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);

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
					Product p = new Product();
					p.product();
					break;
				}// end of switch case

			} // end of while loop
		} catch (Exception e) {
			System.out.println("Please Enter a Number");
		}
	}// end of customer()

}// end of class
