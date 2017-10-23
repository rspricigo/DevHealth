package com.devhealth.entity;

import java.util.Date;

public class Agendamento {
	private int nr_sequencia;
	private PessoaFisica cd_pessoa_fisica;
	private int nr_atendimento;
	private Date dt_consulta;
	private Date dt_agendamento;
	private Convenio cd_convenio;
	private Agenda cd_agenda;
	private String ie_status;
	private String classif_agendamento;
	
	public Agendamento() {
		this.cd_pessoa_fisica = new PessoaFisica();
		this.cd_convenio = new Convenio();
		this.cd_agenda = new Agenda();
	}
	
	public int getNrSequencia() {
		return this.nr_sequencia;
	}
	public PessoaFisica getCdPessoaFisica() {
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
	public Convenio getCdConvenio() {
		return this.cd_convenio;
	}
	public Agenda getCdAgenda() {
		return this.cd_agenda;
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
	public void setCdPessoaFisica(PessoaFisica cd_pessoa_fisica) {
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
	public void setCdConvenio(Convenio cd_convenio) {
		this.cd_convenio = cd_convenio;
	}
	public void setCdAgenda(Agenda cd_agenda) {
		this.cd_agenda = cd_agenda;
	}
	public void setIeStatus(String ie_status) {
		this.ie_status = ie_status;
	}
	public void setClassifAgendamento(String classif_agendamento) {
		this.classif_agendamento = classif_agendamento;
	}
	
}