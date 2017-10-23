package com.devhealth.entity;

public class Agenda {
	private int cd_agenda;
	private String ds_agenda;
	private int cd_medico;
	private int cd_especialidade;
	private String ie_tipo_agenda;
	
	public Agenda() {
		
	}
	
	public void setCdAgenda(int cd_agenda) {
		this.cd_agenda = cd_agenda;
	}
	public void setDsAgenda(String ds_agenda) {
		this.ds_agenda = ds_agenda;
	}
	public void setCdMedico(int cd_medico) {
		this.cd_medico = cd_medico;
	}
	public void setCdEspecialidade(int cd_especialidade) {
		this.cd_especialidade = cd_especialidade;
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
	public int getCdMedico() {
		return this.cd_medico;
	}
	public int getCdEspecialidade() {
		return this.cd_especialidade;
	}
	public String getIeTipoAgenda() {
		return this.ie_tipo_agenda;
	}
	
}