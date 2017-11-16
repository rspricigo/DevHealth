package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class ProcAgendamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_sequencia;
	@ManyToOne
	private Agendamento agendamento;
	@OneToOne
	private Procedimento procedimento;
	private int quantidade;
	private String ie_lado;
	private String observacao;
	
	public int getNr_sequencia() {
		return nr_sequencia;
	}
	public void setNr_sequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	public Procedimento getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getIe_lado() {
		return ie_lado;
	}
	public void setIe_lado(String ie_lado) {
		this.ie_lado = ie_lado;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
		
	
	
}
