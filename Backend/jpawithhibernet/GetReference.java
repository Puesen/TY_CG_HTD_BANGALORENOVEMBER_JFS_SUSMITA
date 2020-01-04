package com.capgimini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;

public class GetReference {

	public static void main(String[] args) {
			EntityManager entityManager =null;
			EntityTransaction transaction=null;

			try {
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
				entityManager =entityManagerFactory.createEntityManager();
				transaction=entityManager.getTransaction();
				transaction.begin();
				//Movie record= entityManager.find(Movie.class, 101);    find method unnecessary hit db
				Movie record= entityManager.getReference(Movie.class, 110);//find method will give the actual address of object getReference will give Proxy address or false address
				
				System.out.println(record.getClass());
				record.setMname("Aber Bomkesh");
				System.out.println("Record Update");
				transaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
		}
	}
