package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Contato {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_sequencia;
	private PessoaFisica cd_pessoa_fisica;
	private CEP cd_cep;
	private int numero;
	private String ds_logradouro;
	private String complemento;
	private String email;

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

	public CEP getCd_cep() {
		return cd_cep;
	}

	public void setCd_cep(CEP cd_cep) {
		this.cd_cep = cd_cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDs_logradouro() {
		return ds_logradouro;
	}

	public void setDs_logradouro(String ds_logradouro) {
		this.ds_logradouro = ds_logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
