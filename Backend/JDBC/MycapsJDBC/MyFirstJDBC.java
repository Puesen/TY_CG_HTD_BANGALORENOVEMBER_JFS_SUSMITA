package com.caps.jdbc;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Connection;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		//load the driver
		try {
		//Driver driver=new com.mysql.jdbc.Driver();
		//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Loaded......  ");
		
		//Get DBConnection via Driver
		String dbUr1="jdbc:mysql://localhost:3306/ty_cg_nov6" + "?user=root&password=root";
		conn= DriverManager.getConnection(dbUr1);
		System.out.println("Conection Established.......");
		
		//Issue SQL query via connection
		String query="SELECT * From users_info";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(query);
	   System.out.println("Query Issued...");
	   System.out.println("*************");
		
		//Process the Result returned
		
		while(rs.next()) {
			System.out.println("userid: " +rs.getInt("userid"));
			System.out.println("username: " +rs.getString("username"));
			System.out.println("password: " +rs.getString("password"));
			System.out.println("*********");
		}
		}catch(Exception e) {
			
		}finally {
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
