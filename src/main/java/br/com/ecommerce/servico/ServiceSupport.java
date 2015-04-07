package br.com.ecommerce.servico;

import java.io.Serializable;
import java.util.Collection;

import br.com.ecommerce.modelo.Entidade;
import br.com.ecommerce.repository.DAO;
import br.com.ecommerce.servico.exception.NegocioException;

public abstract class ServiceSupport<E extends Entidade> implements Serializable {

	private static final long serialVersionUID = 1267738798452136425L;

	protected abstract DAO<E> getDAO();

	public void salvar(final E entidade) throws NegocioException {

		this.getDAO().salvar(entidade);
	}

	public E alterar(final E entidade) throws NegocioException {

		return this.getDAO().alterar(entidade);
	}

	public void remover(final E entidade) throws NegocioException {

		final E entidadePesquisada = this.getDAO().obter(entidade.getID());

		this.getDAO().remover(entidadePesquisada);
	}

	public Collection<E> listar() {

		return this.getDAO().listar();
	}
}
