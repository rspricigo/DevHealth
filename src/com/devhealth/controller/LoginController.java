package com.devhealth.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.devhealth.entity.Usuario;

@Controller
public class LoginController {

	@RequestMapping("/Login")
	public String login() {
		return "/Usuario/TelaLogin";
	}
	
	@RequestMapping("efetuaLogin")
	public ModelAndView efetuaLogin(Usuario u, HttpSession session) {
		ModelAndView mv;
		if(usuarioValido(u)) {
			session.setAttribute("usuarioLogado", u);
			mv = new ModelAndView("Usuario/LoginSucesso");
			
		}else {
			mv = new ModelAndView("Usuario/TelaLogin");
		}
		return mv;
	}
	
	@RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:loginForm";
    }

	private boolean usuarioValido(Usuario u) {
		if(u.getNm_usuario().equals("Jasper")) {
			return true;
		}else {
		return false;
		}
	}
	
	
}
