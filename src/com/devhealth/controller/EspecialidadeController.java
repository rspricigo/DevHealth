package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.EspecialidadeDAO;
import com.devhealth.entity.Especialidade;

@Controller
public class EspecialidadeController {
	@RequestMapping("/Especialidade")
	public String execute() {
		return "/Especialidade/Especialidade";
	}
	
	@RequestMapping("adicionaEspecialidade")
	public String adicionaEspecialidade(Especialidade e) {
		EspecialidadeDAO dao = new EspecialidadeDAO();
		dao.save(e);		
		return "/Especialidade/CadastradoComSucesso";
	}
}
