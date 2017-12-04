package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.AgendamentoDAO;
import com.devhealth.entity.Agendamento;

@Controller
public class AgendamentoController {

	@RequestMapping("/Agendamento")
	public String execute() {
		return "/Agendamento/Agendamento";
	}
	
	@RequestMapping("/adicionaAgendamento")
	public String adicionaAgendamento(Agendamento p) {
		AgendamentoDAO dao = new AgendamentoDAO();
		dao.save(p);
		return "/Agendamento/CadastradoComSucesso";
	}
			
}

