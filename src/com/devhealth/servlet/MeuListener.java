package com.devhealth.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

import com.devhealth.dao.TesteDAO;

//@WebListener
public class MeuListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
		try {
			TesteDAO teste = new TesteDAO();
			teste.teste();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	
}
