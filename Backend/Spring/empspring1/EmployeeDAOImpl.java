package com.capgimini.empspring1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgimini.empspring1.bean.EmployeeBean;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	@PersistenceUnit
	EntityManagerFactory factory;
	@Override
	public EmployeeBean auth(String email, String password) {
		EntityManager manager =factory.createEntityManager();
		String jpql="from EmployeeBean where email=:email ";
		TypedQuery<EmployeeBean> query=manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("email", email);
		
	//	query.setParameter("password", password);
		try {
			EmployeeBean bean= query.getSingleResult();
			BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
			if(encoder.matches(password, bean.getPassword())) {
				return bean;
			}else {
				return null;
			}
			
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public boolean register(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	@Override
	public List<EmployeeBean> getEmployees(String key) {
		String jpql="from EmployeeBean where name=:name or email=:email" ;
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query=manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("name", key);
		query.setParameter("email", key);
		return query.getResultList();

	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		EmployeeBean bean= manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

}
