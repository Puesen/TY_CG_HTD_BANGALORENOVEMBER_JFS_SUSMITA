package com.capgimini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("Test");
				
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie record= entityManager.find(Movie.class, 101);
		
		System.out.println("Id is : " + record.getMid());
		System.out.println("Id name : " +record.getMname());
		System.out.println("Id record : " +record.getRating());
		entityManager.close();
		
	}//end the main method

}//end the class
