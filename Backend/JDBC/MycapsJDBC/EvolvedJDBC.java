package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;


public class EvolvedJDBC {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
	String user= sc.nextLine();
	String password =sc.nextLine();
	String query="SELECT * from users_info";
	
	try(Connection conn=DriverManager.getConnection(dbUrl,user,password);
		Statement stmt=  conn.createStatement();
			ResultSet rs=stmt.executeQuery(query)){
	while( rs.next()) {
				System.out.println("User id: " +rs.getInt(1));
				System.out.println("User name: "+rs.getString(2));
				System.out.println("Email: "+rs.getString(3));
				System.out.println();
			}
		sc.close();
	 
		
	
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
