package com.cap.shop.admin.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.cap.shop.admin.bean.FlipkartBean;

public class FlipkartDAOImpl implements FlipkartDAO {

	FileReader reader;
	Properties prop;
	FlipkartBean user;
	Connection conn=null;
	Statement stmt=null;

	Scanner sc=new Scanner(System.in);

	public FlipkartDAOImpl() {
		try {

			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<FlipkartBean> getAllProducts() {
		List<FlipkartBean> list=new ArrayList<FlipkartBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while( rs.next()) {

				FlipkartBean prod=new FlipkartBean();
				prod.setProductId(rs.getInt(1));
				prod.setProductName(rs.getString(2));
				prod.setProductCost(rs.getDouble(3));
				prod.setProductColor(rs.getString(4));
				prod.setDescription(rs.getString(5));
				prod.setNumOfProd(rs.getInt(6));
				list.add(prod);

			}
			return list;
		}catch(Exception e) {

			e.printStackTrace();
		}
		return null;
	}



	@Override
	public boolean search(FlipkartBean ProductId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("searchQuery"));
				){			

			System.out.println("Enter the Product Id to Search");
			pstmt.setString(1, sc.nextLine());

			int count=pstmt.executeUpdate();
			System.out.println("query issued");
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}



}


