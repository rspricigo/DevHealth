package com.devhealth.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.devhealth.util.JPAUtil;

public abstract class GenericDAO<T, I extends Serializable> {

	private Class<T> persistedClass;
	
	protected GenericDAO() {
		
	
	}
	
	protected GenericDAO(Class<T> persistedClass) {
		this();
		this.persistedClass = persistedClass;
	}
	
	public T save(T entity) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.flush();
		em.getTransaction().commit();
		return entity;
	}
	
	public T update(T entity) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.flush();
		em.getTransaction().commit();
		return entity;
	}
	
	public List<T> getList() {
	       CriteriaBuilder builder = JPAUtil.getEntityManager()
	    		   .getCriteriaBuilder();
	       CriteriaQuery<T> query = builder.createQuery(persistedClass);
	       query.from(persistedClass);
	       return JPAUtil.getEntityManager().createQuery(query).getResultList();
	   }

	   public T encontrar(I id) {
	       return JPAUtil.getEntityManager().find(persistedClass, id);
	   }
	
}
