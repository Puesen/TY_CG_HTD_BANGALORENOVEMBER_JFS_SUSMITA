package com.capgimini.fms.app;

import java.util.List;
import java.util.Scanner;

import com.capgimini.fms.beans.ContractBean;
import com.capgimini.fms.dao.ContractDAO;

public class ContractApp {

	public static void main(String[] args) {
		ContractDAO dao=ContractDAOManagerFactory.getContractDAO();
		Scanner sc=new Scanner(System.in);
		while (true) {
			
			System.out.println("Press 1 to add customer");
			System.out.println("Press 2 to delete customer");
			System.out.println("Press 3 to display customer");
			
			int choice= sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Enter Customer id");
				int id=sc.nextInt();
				System.out.println("Enter Contract Number");
				int contractno=sc.nextInt();
				System.out.println("Enter haulid");
				int haulid=sc.nextInt();
				
				System.out.println("Enter Delivery Date");
				int date=sc.nextInt();

				System.out.println("Enter Delivery Day");
				String day=sc.next();
				System.out.println("Enter Quantity");
				int quantity=sc.nextInt();


				
				ContractBean bean=new ContractBean();
				bean.setCustid(id);
				bean.setContractno(contractno);
				bean.setHaulid(haulid);
				bean.setDeliverydate(date);
				bean.setDeliveryday(day);
				bean.setQuantity(quantity);
				
				boolean check=dao.addContract(bean);
;
				if(check) {
					System.out.println("Contract added to the list");
				}else {
					System.out.println("Contract id is repeted");
				}
				break;
			case 2:
				System.out.println("Enter Contract id");
				int id1=sc.nextInt();
				boolean check1=dao.deleteContract(id1);
				if(check1) {
					System.out.println("Contract details deleted");
				}else {
					System.out.println("Contract not deleted");
				}
				break;
			
			case 3:
				List<ContractBean> List=dao.ShowContract();
				System.out.println(List);
				if(List!=null) {
				for (ContractBean contractBean: List) {
					System.out.println(contractBean);
					
				}
				}
				break;
			default:System.exit(0);
				break;
			}

		}
		
	}
}
