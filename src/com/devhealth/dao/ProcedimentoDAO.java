package com.devhealth.dao;

import com.devhealth.entity.Procedimento;

public class ProcedimentoDAO extends GenericDAO<Procedimento, Long> {
	public ProcedimentoDAO() {
		super(Procedimento.class);
	}
}
