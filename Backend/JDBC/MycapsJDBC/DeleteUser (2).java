package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class DeleteUser {

	public static void main(String[] args) {
 UserServices services=UserFactory.instanceOfUserServices();
 UserBean user=new UserBean();
 Scanner sc= new Scanner(System.in);
 
 System.out.println("Enter Userid.........");
 user.setUserid(Integer.parseInt(sc.nextLine()));
 System.out.println("Enter User Name..........");
 user.setUsername(sc.nextLine());
 System.out.println("Enter Email..........");
 user.setEmail(sc.nextLine());
 System.out.println("Enter Password..........");
 user.setPassword(sc.nextLine());
 
 if(services.InsertUser(user))
 {
	 System.out.println("User Inserted");
 }else {
	 System.out.println("Something Went wrong");
 }
 sc.close();
	}

}
