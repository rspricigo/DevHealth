package com.devhealth.entity;

public enum Sexo {
	
	Feminino('F'), Masculino('M'), Indefinido('I');
	
	public char ie_religiao;
	
	private Sexo (char ie_religiao) {
		this.ie_religiao = ie_religiao;
	}

}
