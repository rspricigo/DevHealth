package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.ConvenioDAO;
import com.devhealth.entity.Convenio;

@Controller
public class ConvenioController {
	@RequestMapping("/Convenio")
	public String execute() {
		return "/Convenio/Convenio";
	}
	
	@RequestMapping("adicionaConvenio")
	public String adicionaConvenio(Convenio c) {
		ConvenioDAO dao = new ConvenioDAO();
		dao.save(c);		
		return "/Convenio/CadastradoComSucesso";
	}
}
