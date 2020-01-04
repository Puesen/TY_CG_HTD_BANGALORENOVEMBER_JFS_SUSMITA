package com.capgimini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.javawithhibernete.dto.Movie;
import com.capgimini.mapping.onetoone.EmployeeInfo;
import com.capgimini.mapping.onetoone.EmployeeOtherInfo;

public class TestOneToOne {

	public static void main(String[] args) {
//		EmployeeInfo emp=new EmployeeInfo();
//		emp.setEid(3);
//		emp.setEname("Anindya");
//		emp.setEmail("ashu@gmail.com");
//		emp.setPassword("hemu");
//		
//		EmployeeOtherInfo other=new EmployeeOtherInfo();
//		other.setEmpInfo(emp);
//		other.setFname("Animesh");
//		other.setId(7);
//		other.setPancard("EY8729J");
		EntityManager entityManager =null;
		EntityTransaction transaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager =entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			entityManager.find(EmployeeInfo.class,1);
			EmployeeInfo emp=new EmployeeInfo();
			System.out.println(emp.getOther().getPancard());
			entityManager.persist(emp);
			//System.out.println("Record Inserted");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
