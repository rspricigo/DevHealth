package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.PessoaFisicaDAO;
import com.devhealth.entity.PessoaFisica;

@Controller
public class PessoaController {
	@RequestMapping("/Pessoa")
	public String execute() {
		return "/Pessoa/Pessoa";
	}
	
	@RequestMapping("adicionaPessoa")
	public String adicionaPessoa(PessoaFisica pf) {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		dao.save(pf);		
		return "/Pessoa/CadastradoComSucesso";
	}
}
