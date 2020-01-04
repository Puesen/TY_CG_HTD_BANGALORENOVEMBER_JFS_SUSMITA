package com.capgimini.fmsjpahibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.fmsjpahibernate.dto.ContractBean;
import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.dto.ProductBean;

//create one class CustomerDAOImpl which implements all unimplemented methods of CustomerDAO
public class CustomerDAOImpl implements CustomerDAO {

	Scanner sc = new Scanner(System.in);
	CustomerBean bean1 = new CustomerBean();
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public List<CustomerBean> getAllCustomers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from CustomerBean";
		Query query = entityManager.createQuery(jpql);

		List<CustomerBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}

	public boolean deleteCustomer() {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			try {
				System.out.println("Enter Customer id to delete");
				int customerid = sc.nextInt();
				CustomerBean record = entityManager.find(CustomerBean.class, customerid);
				entityManager.remove(record);
				transaction.commit();
				System.out.println("Customer Details are deleted........");
			} catch (Exception e) {
				System.out.println("Customer id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return true;

	}

	public boolean addCustomer(CustomerBean bean) {

		System.out.println("Enter Customer Id.........");
		int customerid = sc.nextInt();

		bean1.setCustomerid(customerid);
		boolean again;

		do {
			System.out.println("Enter Customer Name........");

			String customername = sc.next();
			if (customername.matches("[A-Z][a-z]*")) {
				System.out.println("Valid Customer Name");
				bean1.setCustomername(customername);
				again = true;
			}

			else {
				System.out.println("Invalid Customer Name Please try again........");
				again = false;

			}
		} while (!again);

		do {
			System.out.println("Enter 6 digit postalcode...");
			String postalCode = sc.next();

			if (postalCode.matches("[1-9]{1}[0-9]{5}")) {
				System.out.println("Valid Customer Id");
				bean1.setPostalCode(postalCode);
				again = true;
			}

			else {
				System.out.println("Invalid Customer Id Please try again........");
				again = false;

			}
		} while (!again);

		System.out.println("Enter streetaddress1...");
		String streetAddress1 = sc.next();
		System.out.println("Enter streetaddress2...");
		String streetAddress2 = sc.next();
		System.out.println("Enter town...");
		String town = sc.next();

		do {
			System.out.println("Enter Your EmailID......");
			String email = sc.next();

			if (email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
				System.out.println("Valid Email Id");
				bean1.setEmail(email);
				again = true;
			}

			else {
				System.out.println("Invalid Email Id Please try again........");
				again = false;

			}
		} while (!again);

		do {
			System.out.println("Enter telephoneno...");
			String telephoneno = sc.next();

			if (telephoneno.matches("[0-9]{3}{1}[0-9]{3}{1}[0-9]{4}")) {
				System.out.println("Valid Contract Number");
				bean1.setTelephoneNo(telephoneno);
				again = true;
			}

			else {
				System.out.println("Invalid Contract Number Please try again........");
				again = false;

			}
		} while (!again);

		bean1.setStreetAddress1(streetAddress1);
		bean1.setStreetAddress2(streetAddress2);
		bean1.setTown(town);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			try {
				transaction.begin();
				entityManager.persist(bean1);
				System.out.println("Record Inserted Successfully......");
				transaction.commit();
			} catch (Exception e) {
				System.out.println("Customer id already present in the list.......");
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;
	}

	public boolean modifyCustomer() {
		CustomerBean bean = new CustomerBean();

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			try {
				System.out.println("Enter Customer Id for Update.........");
				int customerid = sc.nextInt();
				CustomerBean record = entityManager.find(CustomerBean.class, customerid);
				System.out.println("Enter Telephone Number to update.......");
				String telephoneNo = sc.next();
				record.setTelephoneNo(telephoneNo);
				transaction.commit();
				System.out.println("Customer Details updated Successfully........");
			} catch (Exception e) {
				System.out.println("Customer id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;

	}

}// end of class