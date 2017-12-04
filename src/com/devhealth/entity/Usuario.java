package com.devhealth.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Usuario {
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_sequencia;
	@ManyToOne
	@JoinColumn(name="cd_pessoa_fisica")
	private PessoaFisica pessoa_fisica;
	private String nm_usuario;

	public int getNr_sequencia() {
		return nr_sequencia;
	}

	public void setNr_sequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}

	public PessoaFisica getPessoa_fisica() {
		return pessoa_fisica;
	}

	public void setPessoa_fisica(PessoaFisica pessoa_fisica) {
		this.pessoa_fisica = pessoa_fisica;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

}
