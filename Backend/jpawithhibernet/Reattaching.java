package com.capgimini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityManager entityManager =null;
		EntityTransaction transaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager =entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record= entityManager.find(Movie.class, 101);
			System.out.println(entityManager.contains(record));
			entityManager.detach(record);
			System.out.println(entityManager.contains(record));
			Movie reattachMovie=entityManager.merge(record);
			reattachMovie.setMname("Dil to Baccha ha ji");

			System.out.println("Record Update");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
