package com.devhealth.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Atendimento {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_atendimento;
	@ManyToOne
	private PessoaFisica pessoa_fisica;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_atendimento;
	@ManyToOne
	private Convenio convenio;
	@ManyToOne
	private PessoaFisica medico;
	@ManyToOne
	private PessoaFisica responsavel;
	private String ie_tipo_atendimento;
	
	public Atendimento() {
		this.pessoa_fisica = new PessoaFisica();
		this.convenio = new Convenio();
		this.medico = new PessoaFisica();
		this.responsavel = new PessoaFisica();
	}
	
	public int getNrAtendimento() {
		return this.nr_atendimento;
	}
	public PessoaFisica getPessoaFisica() {
		return this.pessoa_fisica;
	}
	public Date getDtAtendimento() {
		return this.dt_atendimento;
	}
	public Convenio getConvenio() {
		return this.convenio;
	}
	public PessoaFisica getMedico() {
		return this.medico;
	}
	public PessoaFisica getResponsavel() {
		return this.responsavel;
	}
	public String getIeTipoAtendimento() {
		return this.ie_tipo_atendimento;
	}
	
	public void setNrAtendimento(int nr_atendimento) {
		this.nr_atendimento = nr_atendimento;
	}
	public void setPessoaFisica(PessoaFisica pessoa_fisica) {
		this.pessoa_fisica = pessoa_fisica;
	}
	public void setDtAtendimento(Date dt_atendimento) {
		this.dt_atendimento = dt_atendimento;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public void setMedico(PessoaFisica medico) {
		this.medico = medico;
	}
	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}
	public void setIeTipoAtendimento(String ie_tipo_atendimento) {
		this.ie_tipo_atendimento = ie_tipo_atendimento;
	}
}
