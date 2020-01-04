package com.capgimini.jpawithhibernet.jpql;

import javax.persistence.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;

public class UpdateJPQL {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="update Movie set mname='abcd' where mid=101";
		Query query= entityManager.createQuery(jpql);
		query.executeUpdate();
		transaction.commit();
		entityManager.close();
		System.out.println("Updated");
	}

}

