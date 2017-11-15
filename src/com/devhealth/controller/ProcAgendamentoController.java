package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.ProcAgendamentoDAO;
import com.devhealth.entity.ProcAgendamento;

@Controller
public class ProcAgendamentoController {

	@RequestMapping("/ProcAgendamento")
	public String execute() {
		return "/ProcAgendamento/ProcAgendamento";
	}
	
	@RequestMapping("/adicionaProcAgendamento")
	public String adicionaProcAgendamento(ProcAgendamento p) {
		ProcAgendamentoDAO dao = new ProcAgendamentoDAO();
		dao.save(p);
		return "/ProcAgendamento/CadastradoComSucesso";
	}
			
}
