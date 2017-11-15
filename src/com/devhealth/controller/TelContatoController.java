package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.TelContatoDAO;
import com.devhealth.entity.TelContato;

@Controller
public class TelContatoController {

	@RequestMapping("/TelContato")
	public String execute() {
		return "/TelContato/TelContato";
	}
	
	@RequestMapping("/adicionaTelContato")
	public String adicionaTelContato(TelContato p) {
		TelContatoDAO dao = new TelContatoDAO();
		dao.save(p);
		return "/TelContato/CadastradoComSucesso";
	}
			
}

