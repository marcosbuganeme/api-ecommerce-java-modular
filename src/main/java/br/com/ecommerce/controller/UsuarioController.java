package br.com.ecommerce.controller;

import br.com.ecommerce.controller.form.Formulario;
import br.com.ecommerce.modelo.Usuario;
import br.com.ecommerce.servico.ServiceSupport;

public class UsuarioController extends ControllerSupport<Usuario> {

	private static final long serialVersionUID = -8087279357969312487L;

	@Override
	protected Formulario<Usuario> getForm() {
		return null;
	}

	@Override
	protected ServiceSupport<Usuario> getService() {
		return null;
	}

}
