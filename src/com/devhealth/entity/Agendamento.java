package com.devhealth.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Agendamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_sequencia;
	private int cd_pessoa_fisica;
	private int nr_atendimento;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_consulta;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_agendamento;
	@ManyToOne
	@JoinColumn(name="cd_convenio")
	private Convenio convenio;
	@ManyToOne
	@JoinColumn(name="cd_agenda")
	private Agenda agenda;
	private String ie_status;
	private String classif_agendamento;
	
	public Agendamento() {
	//	this.cd_pessoa_fisica = new PessoaFisica();
	//	this.cd_convenio = new Convenio();
	//	this.cd_agenda = new Agenda();
	}
	
	public int getNrSequencia() {
		return this.nr_sequencia;
	}
	public int getCdPessoaFisica() {
		return this.cd_pessoa_fisica;
	}
	public int getNrAtendimento() {
		return this.nr_atendimento;
	}
	public Date getDtConsulta() {
		return this.dt_consulta;
	}
	public Date getDtAgendamento() {
		return this.dt_agendamento;
	}
	public Convenio getConvenio() {
		return this.convenio;
	}
	public Agenda getAgenda() {
		return this.agenda;
	}
	public String getIeStatus() {
		return this.ie_status;
	}
	public String getClassifAgendamento() {
		return this.classif_agendamento;
	}

	public void setNrSequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}
	public void setCdPessoaFisica(int cd_pessoa_fisica) {
		this.cd_pessoa_fisica = cd_pessoa_fisica;
	}
	public void setNrAtendimento(int nr_atendimento) {
		this.nr_atendimento = nr_atendimento;
	}
	public void setDtConsulta(Date dt_consulta) {
		this.dt_consulta = dt_consulta;
	}
	public void setDtAgendamento(Date dt_agendamento) {
		this.dt_agendamento = dt_agendamento;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	public void setIeStatus(String ie_status) {
		this.ie_status = ie_status;
	}
	public void setClassifAgendamento(String classif_agendamento) {
		this.classif_agendamento = classif_agendamento;
	}
	
}