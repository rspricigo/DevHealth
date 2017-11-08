package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProntuarioController {
	@RequestMapping("/Prontuario")
	public String execute() {
		return "/Prontuario/Prontuario";
	}
}
