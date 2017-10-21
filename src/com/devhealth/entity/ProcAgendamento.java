package com.devhealth.entity;

public class ProcAgendamento {

	private int nr_sequencia;
	private int nr_seq_agendamento;
	private int cd_procedimento;
	private int quantidade;
	private String ie_lado;
	private String observacao;
	
	public int getNr_sequencia() {
		return nr_sequencia;
	}
	public void setNr_sequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}
	public int getNr_seq_agendamento() {
		return nr_seq_agendamento;
	}
	public void setNr_seq_agendamento(int nr_seq_agendamento) {
		this.nr_seq_agendamento = nr_seq_agendamento;
	}
	public int getCd_procedimento() {
		return cd_procedimento;
	}
	public void setCd_procedimento(int cd_procedimento) {
		this.cd_procedimento = cd_procedimento;
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
