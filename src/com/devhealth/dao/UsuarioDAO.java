package com.devhealth.dao;

import com.devhealth.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer> {
	public UsuarioDAO() {
		super(Usuario.class);
	}
}
