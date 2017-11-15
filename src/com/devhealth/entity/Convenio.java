package com.devhealth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Entity
public class Convenio {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cd_convenio;
	private String ds_convenio;
	private String cd_cgc;
	private int nr_rg_ans;
	private String ie_tipo_convenio;
	
	public int getCd_convenio() {
		return cd_convenio;
	}
	public void setCd_convenio(int cd_convenio) {
		this.cd_convenio = cd_convenio;
	}
	public String getDs_convenio() {
		return ds_convenio;
	}
	public void setDs_convenio(String ds_convenio) {
		this.ds_convenio = ds_convenio;
	}
	public String getCd_cgc() {
		return cd_cgc;
	}
	public void setCd_cgc(String cd_cgc) {
		this.cd_cgc = cd_cgc;
	}
	public int getNr_rg_ans() {
		return nr_rg_ans;
	}
	public void setNr_rg_ans(int nr_rg_ans) {
		this.nr_rg_ans = nr_rg_ans;
	}
	public String getIe_tipo_convenio() {
		return ie_tipo_convenio;
	}
	public void setIe_tipo_convenio(String ie_tipo_convenio) {
		this.ie_tipo_convenio = ie_tipo_convenio;
	}
	
	
	
	
		
	
}
