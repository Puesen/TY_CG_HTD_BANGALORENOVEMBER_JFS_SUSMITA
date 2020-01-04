package com.capgimini.jpawithhibernet.jpql;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;


public class RetrieveJPQL {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="select mname from Movie";
		Query query=entityManager.createQuery(jpql);

		List<String> record= query.getResultList();
		for(String movie:record) {
			/*System.out.println("Movie id is "+ movie.getMid() );
			System.out.println("Movie Name is "+ movie.getMname() );
			System.out.println("Movie Rating is "+ movie.getRating() );

			 */		
			System.out.println(movie);
		}

		entityManager.close();

	}
}
