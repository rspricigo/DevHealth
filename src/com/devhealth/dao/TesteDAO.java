package com.devhealth.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteDAO {
	EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("mydb");
	
	EntityManager em = factory.createEntityManager();
}
