package com.caps.jdbc;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//Load the driver

			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded.......");

			//Get the DB connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection Established........");

			//Issue SQL query
			String query="INSERT into  user_info values(?,?,?,?,?)";
			pstmt=conn.prepareStatement(query);

			System.out.println("Enter User id......");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter username........");
			pstmt.setString(2, sc.nextLine());

			System.out.println("Enter Email........");
			pstmt.setString(3, sc.nextLine());

			System.out.println("Enter Password........");
			pstmt.setString(4, sc.nextLine());
			System.out.println("Enter Mobile Number........");
			pstmt.setString(5, sc.nextLine());

			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("User inserted");
			}else {
				System.err.println("Something Went wrong");
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
		}
	}
}





