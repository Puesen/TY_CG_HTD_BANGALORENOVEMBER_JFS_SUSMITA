package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class UserLogin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;//Load the driver
	
	try {
		Driver driver =new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded........");
		
		//Get DB connection via driver
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6"+"";
		System.out.println("Enter Your username and password");
		String dbUser=sc.nextLine();		
		String dbPass=sc.nextLine();

		String dbUr1="jdbc:mysql://localhost:3306/ty_cg_nov6" + "?user=root&password=root";
		conn=   DriverManager.getConnection(dbUrl,dbUser,dbPass);
		System.out.println("Conection Established.......");
		
		//Issue SQL query via connection
		String query="SELECT * FROM users_info "+ "where userid=1 AND password ='root' ";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(query);
        System.out.println("Query Issued and Executed...");
	    System.out.println("\n********************");
	    

		//Process the results returned
	    if(rs.next()) {
			System.out.println("userid: " +rs.getInt(1));
			System.out.println("username: " +rs.getString(2));
			System.out.println("\n********************");
		}
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Closes the JDBC Objects

	finally {
		try {
			if(conn!=null)
				conn.close();
		}catch(SQLException e)
			{
			e.printStackTrace();
			}
		try {
			if(stmt!=null)
				stmt.close();
		}catch(SQLException e)
			{
			e.printStackTrace();
			}
		try {
				if(rs!=null)
					rs.close();
			}catch(SQLException e)
				{
				e.printStackTrace();
				}
	}
}




	}

