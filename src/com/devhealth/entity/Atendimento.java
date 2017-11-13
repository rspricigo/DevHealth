package com.devhealth.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Atendimento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_atendimento;
	private PessoaFisica cd_pessoa_fisica;
	private Date dt_atendimento;
	private Convenio cd_convenio;
	private PessoaFisica cd_medico;
	private PessoaFisica cd_responsavel;
	private String ie_tipo_atendimento;
	
	public Atendimento() {
		this.cd_pessoa_fisica = new PessoaFisica();
		this.cd_convenio = new Convenio();
		this.cd_medico = new PessoaFisica();
		this.cd_responsavel = new PessoaFisica();
	}
	
	public int getNrAtendimento() {
		return this.nr_atendimento;
	}
	public PessoaFisica getCdPessoaFisica() {
		return this.cd_pessoa_fisica;
	}
	public Date getDtAtendimento() {
		return this.dt_atendimento;
	}
	public Convenio getCdConvenio() {
		return this.cd_convenio;
	}
	public PessoaFisica getCdMedico() {
		return this.cd_medico;
	}
	public PessoaFisica getCdResponsavel() {
		return this.cd_responsavel;
	}
	public String getIeTipoAtendimento() {
		return this.ie_tipo_atendimento;
	}
	
	public void setNrAtendimento(int nr_atendimento) {
		this.nr_atendimento = nr_atendimento;
	}
	public void setCdPessoaFisica(PessoaFisica cd_pessoa_fisica) {
		this.cd_pessoa_fisica = cd_pessoa_fisica;
	}
	public void setDtAtendimento(Date dt_atendimento) {
		this.dt_atendimento = dt_atendimento;
	}
	public void setCdConvenio(Convenio cd_convenio) {
		this.cd_convenio = cd_convenio;
	}
	public void setCdMedico(PessoaFisica cd_medico) {
		this.cd_medico = cd_medico;
	}
	public void setCdResponsavel(PessoaFisica cd_responsavel) {
		this.cd_responsavel = cd_responsavel;
	}
	public void setIeTipoAtendimento(String ie_tipo_atendimento) {
		this.ie_tipo_atendimento = ie_tipo_atendimento;
	}
}
