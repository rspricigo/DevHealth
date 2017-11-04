package com.devhealth.entity;

public class Usuario {

	private int nr_sequencia;
	private PessoaFisica cd_pessoa_fisica;
	private String nm_usuario;

	public int getNr_sequencia() {
		return nr_sequencia;
	}

	public void setNr_sequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}

	public PessoaFisica getCd_pessoa_fisica() {
		return cd_pessoa_fisica;
	}

	public void setCd_pessoa_fisica(PessoaFisica cd_pessoa_fisica) {
		this.cd_pessoa_fisica = cd_pessoa_fisica;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

}
