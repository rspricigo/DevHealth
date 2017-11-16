package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cd_agenda;
	private String ds_agenda;
	@ManyToOne
	private PessoaFisica medico;
	@ManyToOne
	private Especialidade especialidade;
	private String ie_tipo_agenda;
	
	public Agenda() {
		
	}
	
	public void setCdAgenda(int cd_agenda) {
		this.cd_agenda = cd_agenda;
	}
	public void setDsAgenda(String ds_agenda) {
		this.ds_agenda = ds_agenda;
	}
	public void setMedico(PessoaFisica medico) {
		this.medico = medico;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public void setIeTipoAgenda(String ie_tipo_agenda) {
		this.ie_tipo_agenda = ie_tipo_agenda;
	}
	
	public int getCdAgenda() {
		return this.cd_agenda;
	}
	public String getDsAgenda() {
		return this.ds_agenda;
	}
	public PessoaFisica getMedico() {
		return this.medico;
	}
	public Especialidade getEspecialidade() {
		return this.especialidade;
	}
	public String getIeTipoAgenda() {
		return this.ie_tipo_agenda;
	}
	
}