package com.capgimini.jpawithhibernet.jpql;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteJPQL1 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	String jpql="delete Movie where mid=:id";
	Query query=entityManager.createQuery(jpql);
	query.setParameter("id", 102);
	query.executeUpdate();
	transaction.commit();
	System.out.println("Deleted");
	
}
}
