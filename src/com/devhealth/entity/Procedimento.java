package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Procedimento {
	
	
	//enviar para guit
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cd_procedimento;
	String ds_procedimento;
	int cd_area;
	int cd_grupo;
	int cd_especialidade;
	
	
	public int getCd_procedimento() {
		return cd_procedimento;
	}
	public void setCd_procedimento(int cd_procedimento) {
		this.cd_procedimento = cd_procedimento;
	}
	public String getDs_procedimento() {
		return ds_procedimento;
	}
	public void setDs_procedimento(String ds_procedimento) {
		this.ds_procedimento = ds_procedimento;
	}
	public int getCd_area() {
		return cd_area;
	}
	public void setCd_area(int cd_area) {
		this.cd_area = cd_area;
	}
	public int getCd_grupo() {
		return cd_grupo;
	}
	public void setCd_grupo(int cd_grupo) {
		this.cd_grupo = cd_grupo;
	}
	public int getCd_especialidade() {
		return cd_especialidade;
	}
	public void setCd_especialidade(int cd_especialidade) {
		this.cd_especialidade = cd_especialidade;
	}
	
}
