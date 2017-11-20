package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class TelContato {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nr_sequencia;
	@ManyToOne
	@JoinColumn(name="nr_seq_contato")
	private Contato contato;
	private String nr_fax;
	private String nr_fixo;
	private String nr_cel;

	public int getNr_sequencia() {
		return nr_sequencia;
	}

	public void setNr_sequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getNr_fax() {
		return nr_fax;
	}

	public void setNr_fax(String nr_fax) {
		this.nr_fax = nr_fax;
	}

	public String getNr_fixo() {
		return nr_fixo;
	}

	public void setNr_fixo(String nr_fixo) {
		this.nr_fixo = nr_fixo;
	}

	public String getNr_cel() {
		return nr_cel;
	}

	public void setNr_cel(String nr_cel) {
		this.nr_cel = nr_cel;
	}

}
