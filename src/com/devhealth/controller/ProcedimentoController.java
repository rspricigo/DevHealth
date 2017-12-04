package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.ProcedimentoDAO;
import com.devhealth.entity.Procedimento;

@Controller
public class ProcedimentoController {

	@RequestMapping("/Procedimento")
	public String execute() {
		return "/Procedimento/Procedimento";
	}
	
	@RequestMapping("/adicionaProcedimento")
	public String adicionaProcedimento(Procedimento p) {
		ProcedimentoDAO dao = new ProcedimentoDAO();
		dao.save(p);
		return "/Procedimento/CadastradoComSucesso";
	}
			
}
