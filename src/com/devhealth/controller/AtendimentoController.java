package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.AtendimentoDAO;
import com.devhealth.entity.Atendimento;

@Controller
public class AtendimentoController {

	@RequestMapping("/Atendimento")
	public String execute() {
		return "/Atendimento/atendimento";
	}
	
	@RequestMapping("/adicionaAtendimento")
	public String adicionaAtendimento(Atendimento atend) {
		AtendimentoDAO dao = new AtendimentoDAO();
		dao.save(atend);
		return "/Atendimento/CadastradoComSucesso";
	}
			
}

