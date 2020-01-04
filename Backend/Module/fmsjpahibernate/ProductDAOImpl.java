package com.capgimini.fmsjpahibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.dto.ProductBean;

//create one class of ProductDAOImpl which implements ProductDAO interface 
public class ProductDAOImpl implements ProductDAO {
	Scanner sc = new Scanner(System.in);
	ProductBean bean1 = new ProductBean();
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	// Implements all the unimplemented methods of ProductDAO

	public List<ProductBean> getAllProductss() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductBean";
		Query query = entityManager.createQuery(jpql);

		List<CustomerBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}

	public boolean deleteProduct() {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			try {
				System.out.println("Enter Product id to delete");
				int prodid = sc.nextInt();
				ProductBean record = entityManager.find(ProductBean.class, prodid);
				entityManager.remove(record);
				transaction.commit();
				System.out.println("Product Details are deleted........");
			} catch (Exception e) {
				System.out.println("Product id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return true;

	}

	public boolean modifyProduct() {
	
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			try {
				System.out.println("Enter Product Id for Update.........");
				int prodid = sc.nextInt();
				ProductBean record = entityManager.find(ProductBean.class, prodid);
				System.out.println("Enter Product Name to update.......");
				String prodname = sc.next();
				record.setProductname(prodname);
				transaction.commit();
				System.out.println("Product Details updated Successfully........");
			} catch (Exception e) {
				System.out.println("Product id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return true;

	}

	public boolean addProduct(ProductBean bean) {
		boolean again;
		System.out.println("Enter 4 digit Product Id........");
		int prodid = sc.nextInt();
		bean1.setProductid(prodid);

		System.out.println("Enter productname...");
		String pname = sc.next();
		System.out.println("Enter product Description...");
		String pdesc = sc.next();
		bean1.setProductname(pname);
		bean1.setProductdsc(pdesc);

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
				System.out.println("Product id already present in the list.......");
			}} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;
	}

}// end of class
