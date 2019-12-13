package com.capgimini.contact.option;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemoveContact {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try {
		//Load the driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver Loaded.......");
		
		//Get the DB connection
        String dbUrl="jdbc:mysql://127.0.0.1:3306/ContactFiles";
        System.out.println("Enter DB user and password");
        String user=sc.nextLine();
        String password=sc.nextLine();
        conn=DriverManager.getConnection(dbUrl,user,password);
		System.out.println("Connection Established........");
		
		//Issue SQL query
       String query="DELETE from Contact where name= ?";
       pstmt=conn.prepareStatement(query);
       
		System.out.println("Enter Name");
		pstmt.setString(1, sc.nextLine());
		
		int count=pstmt.executeUpdate();
		if(count>0) {
			System.out.println("Contact Deleted");
		}else {
			System.err.println("Something Went wrong");
		}
		
		
			
			} catch (Exception e) {
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

