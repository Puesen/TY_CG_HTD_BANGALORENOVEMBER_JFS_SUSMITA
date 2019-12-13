package com.capgimini.contact.app;

import java.util.List;
import java.util.Scanner;

import com.capgimini.contact.bean.Contactbean;
import com.capgimini.contact.dao.ContactDAO;

public class ContactApp {

	public static void main(String[] args) {
		ContactDAO dao=ContactDAOManagerFactory.getContractDAO();
		Scanner sc=new Scanner(System.in);
		while (true) {


			System.out.println("Press 1 to display all Contact name  ");
			System.out.println("Press 2 to Search Contact name  ");
			System.out.println("Press 3 to modify your Contact   ");

			int choice= sc.nextInt();
			switch(choice) {
			case 1:

				List<Contactbean> List=dao.ShowContact();
				System.out.println(List);
				if(List!=null) {
					for (Contactbean contractBean: List) {
						System.out.println(contractBean);
					}
				}
				break;



			}
		}
	}
}