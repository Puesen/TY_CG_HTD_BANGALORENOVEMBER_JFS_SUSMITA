package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		//Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver has been loaded.............");
			
			//Get DB connection through driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
	        conn=DriverManager.getConnection(dbUrl,user,password);
	        
	    	//Issue SQL connection
			String query="update Users_info set email=?" + "Where userid = ? and password = ?";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter user id");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
            System.out.println("Enter new email");
            pstmt.setString(1, sc.nextLine());
            System.out.println("Enter the password to update");
            pstmt.setString(3, sc.nextLine());
            
            int count=pstmt.executeUpdate();
            System.out.println("Query Issued........");
          //process the results returned
    		if(count>0) {
    			System.out.println("Query ok, "+ count+ "Rows effected");
    		}else {
    			System.err.println("Something Went wrong");
    		}
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//close all JDBC connection
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
