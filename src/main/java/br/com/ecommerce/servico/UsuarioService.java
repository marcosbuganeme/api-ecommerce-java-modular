package br.com.ecommerce.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.modelo.Usuario;
import br.com.ecommerce.repository.UsuarioDAO;

@Service
public class UsuarioService extends ServiceSupport<Usuario> {

	private static final long serialVersionUID = -2713093427008820733L;

	@Autowired
	private UsuarioDAO dao;

	@Override
	protected UsuarioDAO getDAO() {

		return this.dao;
	}

}
