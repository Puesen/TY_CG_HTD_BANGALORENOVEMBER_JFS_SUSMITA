package com.cap.shop.admin.bean;
//Import all the packages
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Create one class
public class Search {
	//create one main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//Load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);


			//Get the DB connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/Flipkart";
			conn=DriverManager.getConnection(dbUrl,"root","root");

			//Issue SQL query
			String query="SELECT * from Product_Info where ProductID = ? ";	
			
		       pstmt=conn.prepareStatement(query);
		       
				System.out.println("Enter Product id......");
				pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
				rs=pstmt.executeQuery(query);
				
					while(rs.next()) {
					System.out.println("Productid: " +rs.getInt("ProductID"));
					System.out.println("ProductName: " +rs.getString("Product Name"));
					System.out.println("ProductCost: " +rs.getDouble("Product Cost"));
					System.out.println("ProductColor: " +rs.getString("Product Color"));
					System.out.println("Description: " +rs.getString("Description"));
					System.out.println("NumOfProd: " +rs.getInt("Number Of Products"));
					
					System.out.println("*********");
				}		
					
				//Process the Result returned
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Closes the JDBC Objects
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

