package com.capgimini.Web.App.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgimini.Web.App.dto.Product;
@Repository
public class ProductDAOImpl implements ProductDAO
{
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(Product bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		Product productBean = new Product();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Product searchProduct(int id) {
		String jpql = "from Product where id=:id";
	    EntityManager manager=factory.createEntityManager();
		TypedQuery<Product> query = manager.createQuery(jpql,Product.class);
		query.setParameter("id", id);
		try {
		return query.getSingleResult();
	} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

}
