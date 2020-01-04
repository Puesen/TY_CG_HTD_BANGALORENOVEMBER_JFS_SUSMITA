package com.capgimini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;

public class InsertDemo {

	public static void main(String[] args) {
		Movie movie=new Movie();
		movie.setMid(102);
		movie.setMname("Love U Jindegi");
		movie.setRating(5);
		EntityManager entityManager =null;
		EntityTransaction transaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager =entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);

			System.out.println("Record Inserted");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
