package com.caps.jdbc;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.sql.Connection;
import java.sql.Statement;

public class EvolvedJDBCv2 {

	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		try {
			reader =new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver Loaded....\n");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while( rs.next()) {
				System.out.println("---------------------------------------");
				System.out.println("User id: " +rs.getInt(1));
				System.out.println("User name: "+rs.getString(2));
				System.out.println("Email: "+rs.getString(3));
				System.out.println("---------------------------------------");}

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}