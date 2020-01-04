package com.capgimini.firstwebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");

	@Override
	public EmployeeInfoBean searchEmployee(int empid) {

		EntityManager entityManager=emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean =entityManager.find(EmployeeInfoBean.class,empid);
		entityManager.close();
		return employeeInfoBean;
		// TODO Auto-generated method stub

	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {

		EntityManager em=emf.createEntityManager();
		String jpql= "from EmployeeInfoBean where empId=:empId and password=:pwd";
		Query query= em.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", password);

		EmployeeInfoBean employeeInfoBean= null;
		try {
			employeeInfoBean= (EmployeeInfoBean) query.getSingleResult();
		}catch(Exception e) {
			e.printStackTrace();
		}

		em.close();
		return employeeInfoBean;

	}//end of authenticate()

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isAdded=false;
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=null;
		try {
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(employeeInfoBean);
			transaction.commit();
			isAdded=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return isAdded;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		boolean isDeleted=false;
		EntityManager entityManager=emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean =entityManager.find(EmployeeInfoBean.class,empid);
		EntityTransaction transaction=null;
		if(employeeInfoBean != null) {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.remove(employeeInfoBean);
			transaction.commit();
			isDeleted = true;
		}else {
			System.out.println("No emp Information is present");
		}
		entityManager.close();
		return isDeleted;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated =false;
		EntityManager manager=emf.createEntityManager();
		EmployeeInfoBean existingEmployeeInfo=manager.find(EmployeeInfoBean.class, employeeInfoBean);
		EntityTransaction transaction =manager.getTransaction();
		
		if(existingEmployeeInfo != null) {
			try {
				transaction.begin();
				String newName =employeeInfoBean.getName().trim();
				if(newName != null && !newName.isEmpty()) {
					existingEmployeeInfo.setName(newName);
				}
				int newAge =employeeInfoBean.getAge();
				if(newAge>18) {
					existingEmployeeInfo.setAge(newAge);
				}
				double newSalary =employeeInfoBean.getSalary();
				if(newSalary>0) {
					existingEmployeeInfo.setSalary(newSalary);
				}
				
				
				String newDesignation =employeeInfoBean.getDesignation();
				if(newDesignation != null && !newDesignation.isEmpty()) {
					existingEmployeeInfo.setDesignation(newDesignation);
				}
				String newPassword =employeeInfoBean.getPassword();
				if(newPassword != null && !newPassword.isEmpty()) {
					existingEmployeeInfo.setPassword(newPassword);
				}
				transaction.commit();
				isUpdated=true;
					
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//end of outer if
		manager.close();

		return isUpdated;
	}//end of update employee

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager entityManager=emf.createEntityManager();
		String jpql= "from EmployeeInfoBean";
		Query query=entityManager.createQuery(jpql);
		List<EmployeeInfoBean> employeeList= query.getResultList();

		return employeeList;
	}



}