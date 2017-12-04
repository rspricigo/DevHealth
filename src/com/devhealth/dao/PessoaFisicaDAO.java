package com.devhealth.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.devhealth.entity.PessoaFisica;
import com.devhealth.util.JPAUtil;

public class PessoaFisicaDAO extends GenericDAO<PessoaFisica, Integer> {

	public PessoaFisicaDAO() {
		super(PessoaFisica.class);
	}
	
	
	public List<PessoaFisica> getListPorNome(String nome) {
		
		//String jpql = "Select p from PessoaFisica p where p.nm_pessoa = :nm_pessoa";
		EntityManager em = JPAUtil.getEntityManager();
		
		//Query cq = em.createQuery(jpql,PessoaFisica.class);
		//cq.setParameter("nm_pessoa", nome)
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		Predicate predicate = cb.and();
		CriteriaQuery<PessoaFisica> query = cb.createQuery(PessoaFisica.class);
		Root<PessoaFisica> from = query.from(PessoaFisica.class);
		TypedQuery<PessoaFisica> tp = em.createQuery(	query.select(from).where(
				predicate = cb.and(predicate, 
		        cb.like(from.<String>get("nm_pessoa"), "%"+nome+"%"))));
		List<PessoaFisica> lista = tp.getResultList();
		for(PessoaFisica p : lista) {
			System.out.println(p.getNm_pessoa());
		}
		return lista;		
	   }
	
}
