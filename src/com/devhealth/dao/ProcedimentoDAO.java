package com.devhealth.dao;

import com.devhealth.entity.Procedimento;

public class ProcedimentoDAO extends GenericDAO<Procedimento, Integer> {
	public ProcedimentoDAO() {
		super(Procedimento.class);
	}
}
