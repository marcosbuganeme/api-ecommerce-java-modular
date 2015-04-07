package br.com.ecommerce.repository;

import java.io.Serializable;
import java.util.Collection;

import br.com.ecommerce.modelo.Entidade;

public interface DAO<E extends Entidade> extends Serializable {

	E obter(final Long id);
	
	void salvar(final E entidade);

	E alterar(final E entidade);

	void remover(final E entidade);

	Collection<E> listar();
}
