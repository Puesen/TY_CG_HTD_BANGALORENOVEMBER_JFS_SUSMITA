package com.caps.forestrymanagement1.admin.contract;

import java.util.Scanner;

import com.caps.forestrymangement1.admin.main.MainForestry;


public class Contract {
	
	public void contractor() {
		
		ContractBean bean=new ContractBean();
		ContractDAO dao=DAOManager.getContractDAO();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to search data");
			System.out.println("Enter 4 to get all data");
			System.out.println("Enter 5 to return home");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter contractno...");
				int contractno=sc.nextInt();
				System.out.println("Enter customerid...");
				int customerid=sc.nextInt();
				System.out.println("Enter haulierid...");
				int haulierid=sc.nextInt();
				System.out.println("Enter productid...");
				int productid=sc.nextInt();
				System.out.println("Enter quantity...");
				int quantity=sc.nextInt();
				System.out.println("Enter deliverydate...");
				String deliverydate=sc.next();
				System.out.println("Enter deliveryday...");
				String deliveryday=sc.next();
				ContractBean bean1=new ContractBean();
				bean1.setContractno(contractno);
				bean1.setCustomerid(customerid);
				bean1.setHaulierid(haulierid);
				bean1.setProductid(productid);
				bean1.setQuantity(quantity);
				bean1.setDeliverydate(deliverydate);
				bean1.setDeliveryday(deliveryday);
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
			case 3:
				System.out.println("Enter contractno to search");
				int contractno1=sc.nextInt();
				if(bean!=null)
				{
				ContractBean bean2=dao.getContract(contractno1);
				try {
				System.out.println(bean2.getContractno());
				System.out.println(bean2.getCustomerid());
				System.out.println(bean2.getHaulierid());
				System.out.println(bean2.getProductid());
				System.out.println(bean2.getQuantity());
				System.out.println(bean2.getDeliverydate());
				System.out.println(bean2.getDeliveryday());
				}catch(Exception e){
					System.out.println("Check the contact number");
				}
				}
				else {
					System.out.println("contract details not found....!!!");
				}

				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);

				break;
			case 4:
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
			case 5:
				MainForestry m=new MainForestry();
				m.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			default:
				break;
			}
			
			
			
		}


		}

}
