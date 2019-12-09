package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class UserLogin1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
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
		String query="SELECT * FROM users_info "+ "where userid = ? AND password =? ";
		pstmt=conn.prepareStatement(query);
		
		System.out.println("Enter User id......");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Password........");
		pstmt.setString(2, sc.nextLine());
		
		rs=pstmt.executeQuery();
		
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
			if(pstmt!=null)
				pstmt.close();
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

