package com.capgimini.jpawithhibernet;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgimini.mapping.manytomany.TrainingInfo;
import com.capgimini.mapping.manytoone.EmployeeExperience;
import com.capgimini.mapping.onetoone.EmployeeInfo;
import com.capgimini.mapping.onetoone.EmployeeOtherInfo;

public class TestManyToMany {

	public static void main(String[] args) {
		EmployeeInfo info=new EmployeeInfo();
		info.setEid(44);
		info.setEname("Aman");
		info.setEmail("aman@gmail.com");
		
		EmployeeInfo info1=new EmployeeInfo();
		info1.setEid(33);
		info1.setEname("Nikhil");
		info1.setEmail("nikhil@gmail.com");
		
		ArrayList<EmployeeInfo> aList= new ArrayList<EmployeeInfo>();
		aList.add(info);
		aList.add(info1);
		
		TrainingInfo tr= new TrainingInfo();
		tr.setTid(100);
		tr.setTname("JAVA FS");
		tr.setEList(aList);
       
		EntityManager entityManager =null;
		EntityTransaction transaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager =entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();

			entityManager.persist(tr);

			System.out.println("Record Inserted");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
