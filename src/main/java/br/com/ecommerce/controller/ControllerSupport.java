package br.com.ecommerce.controller;

import java.io.Serializable;

import br.com.ecommerce.controller.form.Formulario;
import br.com.ecommerce.modelo.Entidade;
import br.com.ecommerce.servico.ServiceSupport;

public abstract class ControllerSupport<E extends Entidade> implements
		Serializable {

	private static final long serialVersionUID = 1924926725535784926L;

	protected abstract Formulario<E> getForm();

	protected abstract ServiceSupport<E> getService();

	public void salvar() {

		this.getService().salvar(this.getForm().getEntidade());
	}

	public void alterar() {

		this.getService().alterar(this.getForm().getEntidade());
	}

	public void remover() {

		this.getService().remover(this.getForm().getEntidade());
	}

	public void listar() {

		this.getService().listar();
	}
}
