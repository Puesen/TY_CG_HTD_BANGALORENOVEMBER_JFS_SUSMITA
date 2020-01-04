package com.capgimini.fmsjpahibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.fmsjpahibernate.dto.ContractBean;

//create one class which implements all methods ofContractDAO interface
public class ContractDAOImpl implements ContractDAO {

	Scanner sc = new Scanner(System.in);
	ContractBean bean1 = new ContractBean();
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public List<ContractBean> getAllContracts() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ContractBean";
		Query query = entityManager.createQuery(jpql);

		List<ContractBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}

	public boolean addContract(ContractBean bean1) {
		boolean again;
		System.out.println("Enter Contract Number..........");
		long contractno = sc.nextLong();
		
		bean1.setContractno(contractno);
		

		do {
			System.out.println("Enter 4 digit Customerid...");
			String customerid = sc.next();
			if (customerid.matches("[0-9]{4}")) {
				System.out.println("Valid Customerid");
				bean1.setCustomerid(customerid);
				again = true;
			}

			else {
				System.out.println("Invalid Customerid Please try again........");
				again = false;
			}
		} while (!again);

		do {
			System.out.println("Enter 4 digit haulierid...");
			String haulierid = sc.next();
			if (haulierid.matches("[0-9]{4}")) {
				System.out.println("Valid haulierid ");
				bean1.setHaulierid(haulierid);
				again = true;
			}

			else {
				System.out.println("Invalid haulierid Please try again........");
				again = false;

			}
		} while (!again);

		do {
			System.out.println("Enter 4 digit productid...");
			String productid = sc.next();
			if (productid.matches("[0-9]{4}")) {
				System.out.println("Valid productid");
				bean1.setProductid(productid);
				again = true;
			}

			else {
				System.out.println("Invalid productid Please try again........");
				again = false;

			}
		} while (!again);

		do {
			System.out.println("Enter Quantity........");
			String quantity = sc.next();
			if (quantity.matches("[0-9]{1}||[0-9]{2}||[0-9]{3}||[0-9]{4}||[0-9]{5}")) {
				System.out.println("Valid Quantity");
				bean1.setQuantity(quantity);
				again = true;
			}

			else {
				System.out.println("Invalid Quantity Please try again........");
				again = false;

			}
		} while (!again);

		try {
			System.out.println("Enter Delivery Date  (dd-mm-yyyy).........");
			String date = sc.next();
			bean1.setDeliveryDate(date);
		}

		catch (Exception e) {
			System.out.println("Invalid Delivery Date try again........");
			again = false;

		}

		do {
			System.out.println("Enter Delivery Day like Sunday/Monday.........");
			String deliveryday = sc.next();
			if (deliveryday.matches("Sunday||Monday||Tuesday||Wednesday||Thursday||Friday||Saturday")) {
				System.out.println("Valid Delivery day");
				bean1.setDeleveryDay(deliveryday);
				;
				again = true;
			}

			else {
				System.out.println("Invalid Delivery day try again........");
				again = false;

			}
		} while (!again);

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
				e.printStackTrace();
				System.out.println("Contract number already present in the list.......");
			}

	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	return true;
}

public boolean deleteContract() {
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			System.out.println("Enter Contract number to delete.......");
			long contractno3 = sc.nextLong();
			ContractBean record = entityManager.find(ContractBean.class, contractno3);
			entityManager.remove(record);
			System.out.println("Contract Deleted");
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Contract number not present in the list.......");
		}

	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();

	}
	return true;

}

}