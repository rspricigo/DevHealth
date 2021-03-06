package com.devhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devhealth.dao.UsuarioDAO;
import com.devhealth.entity.Usuario;

@Controller
public class UsuarioController {
	
	/* Movido para LoginController
	@RequestMapping("/Login")
	public String login() {
		return "/Usuario/TelaLogin";
	}*/
	
	
	@RequestMapping("/Usuario")
	public String execute() {
		return "/Usuario/Usuario";
	}
	
	@RequestMapping("adicionaUsuario")
	public String adicionaUsuario(Usuario user) {
		UsuarioDAO dao = new UsuarioDAO();
		dao.save(user);		
		return "/Usuario/CadastradoComSucesso";
	}
}
