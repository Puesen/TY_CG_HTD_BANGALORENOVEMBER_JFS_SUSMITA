package com.cap.fmsjdbc.admin.contract;

import java.util.Scanner;

import com.capgimini.forestrymangement1.admin.main.MainForestry;

//create one class
public class Contract {
	//create one method
	public void contractor() {
		//create one ContractBean object
		ContractBean bean=new ContractBean();
		//Create one ContractDAO Object
		ContractDAO dao=DAOManager.getContractDAO();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {//create one while loop
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to get all data");
			System.out.println("Enter 4 to return home");

			int choice=sc.nextInt();//declare one variable
			switch (choice) {//create one switch case
			//case 1 for insert contract details
			case 1:
				ContractBean bean1=new ContractBean();
				boolean again;
			System.out.println("Enter Contract Number..........");
					int contractno=sc.nextInt();
						bean1.setContractno(contractno);

				do {
					System.out.println("Enter 4 digit Customerid...");
					String customerid=sc.next();
					if(customerid.matches("[0-9]{4}")){
						System.out.println("Valid Customerid");
						bean1.setCustomerid(customerid);
						again=true;
					}

					else{
						System.out.println("Invalid Customerid Please try again........");
						again=false;
					}      
				}while(!again);

				do {
					System.out.println("Enter 4 digit haulierid...");
					String haulierid=sc.next();
					if(haulierid.matches("[0-9]{4}")){
						System.out.println("Valid haulierid ");
						bean1.setHaulierid(haulierid);
						again=true;
					}

					else{
						System.out.println("Invalid haulierid Please try again........");
						again=false;

					}      
				}while(!again);

				do {
					System.out.println("Enter 4 digit productid...");
					String productid=sc.next();
					if(productid.matches("[0-9]{4}")){
						System.out.println("Valid productid");
						bean1.setProductid(productid);
						again=true;
					}

					else{
						System.out.println("Invalid productid Please try again........");
						again=false;

					}      
				}while(!again);

				do {
					System.out.println("Enter Quantity........");
					String quantity=sc.next();
					if(quantity.matches("[0-9]{1}||[0-9]{2}||[0-9]{3}||[0-9]{4}||[0-9]{5}")){
						System.out.println("Valid Quantity");
						bean1.setQuantity(quantity);
						again=true;
					}

					else{
						System.out.println("Invalid Quantity Please try again........");
						again=false;

					}      
				}while(!again);

				do {
					System.out.println("Enter Delivery Date like dd/mm/yyyy.........");
					String deliverydate=sc.next();
					if(deliverydate.matches("(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/"
							+ "([0-9]{4}$)")){
						System.out.println("Valid Delivery Date");
						bean1.setDeliverydate(deliverydate);
						again=true;
					}

					else{
						System.out.println("Invalid Delivery Date try again........");
						again=false;

					}      
				}while(!again);

				do {
					System.out.println("Enter Delivery Day like Sunday/Monday.........");
					String deliverydate=sc.next();
					if(deliverydate.matches("Sunday||Monday")){
						System.out.println("Valid Delivery day");
						bean1.setDeliverydate(deliverydate);
						again=true;
					}

					else{
						System.out.println("Invalid Delivery day try again........");
						again=false;

					}      
				}while(!again);

				boolean check=dao.addContract(bean1);
				if(check) {
					System.out.println("contract details added to the list");
				}
				else
				{
					System.out.println("contractno is repeated");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
				//case 1 for delete the contract details
			case 2:
				System.out.println("Enter contractno to delete");
				int contractno3=sc.nextInt();
				if(dao.deleteContract(contractno3)) {

					System.out.println("given contractno details has been deleted");
				}
				else {
					System.out.println("sorry....Unable to deleted");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
							//case 1 for get all details of contract 
			case 3:
				//				try {
				//				ContractBean bean4=null;
				//				if(bean!=null) {
				//			  bean4=(ContractBean) dao.getAllContracts();
				//			  System.out.println(bean4);
				//				}
				//				else
				//				{
				//					System.out.println("oops....there are no contract details");
				//				}
				//				}catch(Exception e) {
				//					System.out.println(e.getMessage());
				//				}
				System.out.println(dao.getAllContracts());

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
				//case 5 for back to main menu 
			case 4:
				MainForestry m=new MainForestry();
				m.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			default:
				System.err.println("Insert valid input 1-4");
				Contract c= new Contract();
				c.contractor();
			}

		}//end of while loop
	}//end of method contractor()

}//end of class
