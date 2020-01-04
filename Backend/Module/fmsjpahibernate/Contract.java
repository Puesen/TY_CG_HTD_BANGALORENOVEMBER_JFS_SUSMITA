package com.capgimini.fmsjpahibernate;

import java.util.Scanner;

import com.capgimini.fmsjpahibernate.dao.ContractDAO;
import com.capgimini.fmsjpahibernate.dto.ContractBean;
import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.factory.DAOManager;

//create one class
public class Contract {
	// create one method
	public void contractor() {
		// create one ContractBean object
		ContractBean bean = new ContractBean();
		// Create one ContractDAO Object
		ContractDAO dao = DAOManager.getContractDAO();
		Scanner sc = new Scanner(System.in);
		try {
			char ch = 'y';
			while (ch == 'y' || ch == 'y') {// create one while loop
				System.out.println("Enter 1 to insert data");
				System.out.println("Enter 2 to delete data");
				System.out.println("Enter 3 to get all data");
				System.out.println("Enter 4 to return home");

				int choice = sc.nextInt();// declare one variable
				switch (choice) {// create one switch case
				// case 1 for insert contract details
				case 1:
					ContractBean bean1 = new ContractBean();

					// check if customer id is present in the list customer details are not added
					// else customer details are added to the list
					boolean check = dao.addContract(bean1);
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);
					break;
				// case 1 for delete the contract details
				case 2:
					dao.deleteContract();
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);

					break;
				// case 3 for get all details of contract
				case 3:
					System.out.println(dao.getAllContracts());

					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);

					break;
				// case 5 for back to main menu
				case 4:
					MainForestry m = new MainForestry();
					m.main(null);
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);
					break;
				default:
					System.out.println("Insert valid input 1-4");
					Contract c = new Contract();
					c.contractor();
				}

			} // end of while loop
		} catch (Exception e) {
			System.out.println("Please enter a number");
		}
	}// end of method contractor()

}// end of class
