package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Especialidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cd_especialidade;
    private String ds_especialidade;
	private int cd_cbo;
	
	public int getCd_especialidade() {
		return cd_especialidade;
	}
	public void setCd_especialidade(int cd_especialidade) {
		this.cd_especialidade = cd_especialidade;
	}
	public String getDs_especialidade() {
		return ds_especialidade;
	}
	public void setDs_especialidade(String ds_especialidade) {
		this.ds_especialidade = ds_especialidade;
	}
	public int getCd_cbo() {
		return cd_cbo;
	}
	public void setCd_cbo(int cd_cbo) {
		this.cd_cbo = cd_cbo;
	}
	
	
	
	

}
