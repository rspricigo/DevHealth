package com.devhealth.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PessoaFisica {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cd_pessoa_fisica;
	private int nr_prontuario;
	private String nm_pessoa;
	private String nm_social;
	private String cd_cpf;
	private String nr_rg;
	private String nr_passaporte;
	private PessoaFisica cd_mae;
	private String ds_mae;
	private Religiao cd_religiao;
	private PessoaFisica cd_pai;
	private String ds_pai;
	private Date dt_nascimento;
	private Sexo ie_sexo;
	private int cd_nacionalidade;
	private Date dt_atualizacao;
	private Date dt_criacao;

	public int getCd_pessoa_fisica() {
		return cd_pessoa_fisica;
	}

	public void setCd_pessoa_fisica(int cd_pessoa_fisica) {
		this.cd_pessoa_fisica = cd_pessoa_fisica;
	}

	public int getNr_prontuario() {
		return nr_prontuario;
	}

	public void setNr_prontuario(int nr_prontuario) {
		this.nr_prontuario = nr_prontuario;
	}

	public String getNm_pessoa() {
		return nm_pessoa;
	}

	public void setNm_pessoa(String nm_pessoa) {
		this.nm_pessoa = nm_pessoa;
	}

	public String getNm_social() {
		return nm_social;
	}

	public void setNm_social(String nm_social) {
		this.nm_social = nm_social;
	}

	public String getCd_cpf() {
		return cd_cpf;
	}

	public void setCd_cpf(String cd_cpf) {
		this.cd_cpf = cd_cpf;
	}

	public String getNr_rg() {
		return nr_rg;
	}

	public void setNr_rg(String nr_rg) {
		this.nr_rg = nr_rg;
	}

	public String getNr_passaporte() {
		return nr_passaporte;
	}

	public void setNr_passaporte(String nr_passaporte) {
		this.nr_passaporte = nr_passaporte;
	}

	public PessoaFisica getCd_mae() {
		return cd_mae;
	}

	public void setCd_mae(PessoaFisica cd_mae) {
		this.cd_mae = cd_mae;
	}

	public String getDs_mae() {
		return ds_mae;
	}

	public void setDs_mae(String ds_mae) {
		this.ds_mae = ds_mae;
	}

	public Religiao getCd_religiao() {
		return cd_religiao;
	}

	public void setCd_religiao(Religiao cd_religiao) {
		this.cd_religiao = cd_religiao;
	}

	public PessoaFisica getCd_pai() {
		return cd_pai;
	}

	public void setCd_pai(PessoaFisica cd_pai) {
		this.cd_pai = cd_pai;
	}

	public String getDs_pai() {
		return ds_pai;
	}

	public void setDs_pai(String ds_pai) {
		this.ds_pai = ds_pai;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Sexo getIe_sexo() {
		return ie_sexo;
	}

	public void setIe_sexo(Sexo ie_sexo) {
		this.ie_sexo = ie_sexo;
	}

	public int getCd_nacionalidade() {
		return cd_nacionalidade;
	}

	public void setCd_nacionalidade(int cd_nacionalidade) {
		this.cd_nacionalidade = cd_nacionalidade;
	}

	public Date getDt_atualizacao() {
		return dt_atualizacao;
	}

	public void setDt_atualizacao(Date dt_atualizacao) {
		this.dt_atualizacao = dt_atualizacao;
	}

	public Date getDt_criacao() {
		return dt_criacao;
	}

	public void setDt_criacao(Date dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
}
