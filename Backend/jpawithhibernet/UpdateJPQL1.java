package com.capgimini.jpawithhibernet.jpql;

import javax.persistence.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateJPQL1 {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="update Movie set mname=:nm where mid=:id";
		Query query= entityManager.createQuery(jpql);
		query.setParameter("id", 102);query.setParameter("nm", "Hate Story");
		query.executeUpdate();
		transaction.commit();
		entityManager.close();
		System.out.println("Updated");
	}

}

