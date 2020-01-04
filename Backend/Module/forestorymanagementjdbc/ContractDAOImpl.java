package com.capgimini.forestrymanagementjdbc.admin.contract;

import java.util.List;
import java.io.FileReader;
import java.sql.DriverManager;
import java.util.Properties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

//create one class which implements all methods ofContractDAO interface
public class ContractDAOImpl implements ContractDAO{

	FileReader reader;
	Properties prop;
	PreparedStatement pstmt= null;
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	public ContractDAOImpl() {
		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<ContractBean> getAllContracts() {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();


				ResultSet rs=stmt.executeQuery(prop.getProperty("query2"))){
			while( rs.next()) {
				System.out.println("---------------------------------------");
				System.out.println("Contractno: " +rs.getLong(1));
				System.out.println("Customerid: "+rs.getString(2));
				System.out.println("Productid: " +rs.getString(3));
				System.out.println("Haulierid: "+rs.getString(4));
				System.out.println("Deliverydate: " +rs.getString(5));
				System.out.println("Deliveryday: "+ rs.getString(6));
				System.out.println("getQuantity: " +rs.getString(7));

				System.out.println("---------------------------------------");}

		}

		catch (Exception e) {
			System.out.println("Data not found");	
		}

		return null;
	}


	@Override
	public boolean addContract(ContractBean bean1) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));

				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query1"));){

			java.util.Date udate=sdf.parse(bean1.getDeliverydate());
			long l=udate.getTime();
			java.sql.Date sdate =new java.sql.Date(l);
			pstmt.setLong(1, bean1.getContractno());
			pstmt.setString(2, bean1.getCustomerid());
			pstmt.setString(4, bean1.getProductid());
			pstmt.setString(3, bean1.getHaulierid());
			pstmt.setDate(5,  sdate );
			pstmt.setString(6, bean1.getDeliveryday());
			pstmt.setString(7, bean1.getQuantity());

			int count =pstmt.executeUpdate();
			if(count>0) {
				return true;
			}

		}

		catch (Exception e) {
			System.err.println("Contact Number already present");
		}

		return false;
	}

	@Override
	public boolean deleteContract(long contractno3) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));

				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query3"));){
			pstmt.setLong(1,contractno3 );
			
			int count =pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}

		}

		catch (Exception e) {
			System.err.println("Records not Deleted");
		}

		return false;
	}


}