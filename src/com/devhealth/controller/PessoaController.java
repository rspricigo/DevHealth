package com.devhealth.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.devhealth.dao.PessoaFisicaDAO;
import com.devhealth.entity.PessoaFisica;

@Controller
public class PessoaController {
	@RequestMapping("/Pessoa")
	public String execute() {
		return "/Pessoa/Pessoa";
	}
	
	@RequestMapping("adicionaPessoa")
	public ModelAndView adicionaPessoa(PessoaFisica pf) {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		dao.save(pf);		
		System.out.println(pf.getCd_pessoa_fisica());
		
		
		return lista();
	}
	
	@RequestMapping("listaPessoas")
	public ModelAndView lista() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> pessoas = dao.getList();
		ModelAndView mv = new ModelAndView("Pessoa/ListaPessoa");
		//model.addAttribute("pessoas", pessoas);
	    mv.addObject("pessoas",pessoas);
	    return mv;
				
	}
}
