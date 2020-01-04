package com.capgimini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;
import com.capgimini.mapping.manytoone.EmployeeExperience;
import com.capgimini.mapping.onetoone.EmployeeInfo;
import com.capgimini.mapping.onetoone.EmployeeOtherInfo;

public class TestManytoOne {

	public static void main(String[] args) {
		EmployeeInfo info=new EmployeeInfo();
		info.setEid(5);
		info.setEname("Pue");
		info.setEmail("sus@gmail.com");
		info.setPassword("pue@123");
		
		EmployeeExperience exp=new EmployeeExperience();
		exp.setEmpInfo(info);
		exp.setCname("Capgimini");
		exp.setNoOfYear(1);
		exp.setExpid(11);
		
		EmployeeExperience exp1=new EmployeeExperience();
		
		exp1.setEmpInfo(info);
		exp1.setCname("TCS");
		exp1.setNoOfYear(2);
		exp1.setExpid(7);
		
			EntityManager entityManager =null;
		EntityTransaction transaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager =entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(exp);
			entityManager.persist(exp1);

			System.out.println("Record Inserted");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
