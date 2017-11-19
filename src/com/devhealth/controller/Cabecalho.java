package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Cabecalho {
	@RequestMapping("/Cabecalho")
	public String execute() {
		return "/cabecalho";
	}
}