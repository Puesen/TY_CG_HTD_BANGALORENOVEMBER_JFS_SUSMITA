package com.capgimini.Web.App.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import com.capgimini.Web.App.dto.Order;
public class OrderDAOImpl implements OrderDAO
{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Order searchOrder(int id) {
		String jpql = "from Order where id=:id";
	    EntityManager manager=factory.createEntityManager();
		TypedQuery<Order> query = manager.createQuery(jpql,Order.class);
		query.setParameter("id", id);
		try {
		return query.getSingleResult();
	} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
}
