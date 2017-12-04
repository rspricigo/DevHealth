package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.ContatoDAO;
import com.devhealth.entity.Contato;

@Controller
public class ContatoController {
	@RequestMapping("/Contato")
	public String execute() {
		return "/Contato/Contato";
	}
	
	@RequestMapping("adicionaContato")
	public String adicionaContato(Contato contato) {
		ContatoDAO dao = new ContatoDAO();
		dao.save(contato);		
		return "/Contato/CadastradoComSucesso";
	}
}
