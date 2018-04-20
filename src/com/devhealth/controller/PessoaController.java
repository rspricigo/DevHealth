package com.devhealth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
		System.out.println(pf.getNm_pessoa());
		dao.save(pf);			
		System.out.println(pf.getCd_pessoa_fisica());
		return lista();
	}
	
	
	
	@RequestMapping("listaPessoas")
	public ModelAndView lista() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> pessoas = dao.getList();
		ModelAndView mv = new ModelAndView("Pessoa/ListaPessoa");
		mv.addObject("pessoas",pessoas);
	    return mv;
				
	}
	
	
	/*@RequestMapping("listaPorNome")
	public @ResponseBody List<PessoaFisica> listaPorNome(@ModelAttribute("nm_mae") String nm_mae) {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> pessoas = dao.getListPorNome(nm_mae);
	    System.out.println("Lari");
	    return pessoas;
				
	}*/
	
	@RequestMapping("listaPorNome")
	public ModelAndView listaPorNome(String nm_pessoa) {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> pessoas = dao.getListPorNome(nm_pessoa);
		ModelAndView mv = new ModelAndView("Pessoa/ListaPessoa");
		mv.addObject("pessoas",pessoas);
	    return mv;
	}
	
	
}
