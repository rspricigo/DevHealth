package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Conteudo {
	@RequestMapping("/Conteudo")
	public String execute() {
		return "/conteudo";
	}

}