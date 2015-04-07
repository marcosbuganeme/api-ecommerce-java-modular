package br.com.ecommerce.repository.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.ecommerce.modelo.Entidade;
import br.com.ecommerce.repository.DAO;
import br.com.ecommerce.servico.exception.RegistroNaoExisteException;

@SuppressWarnings("unchecked")
public abstract class HibernateDAO<E extends Entidade> implements DAO<E> {

	private static final long serialVersionUID = -8035959038170384215L;

	protected abstract EntityManager getEntityManager();

	protected Criteria getCriteria() {

		final Class<E> entidadePersistente = this.getEntidadePersistente();

		return this.getSession().createCriteria(entidadePersistente);
	}

	private Session getSession() {

		return this.getEntityManager().unwrap(Session.class);
	}

	private Class<E> getEntidadePersistente() {

		final Type[] tipoEntidade = ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments();

		return (Class<E>) tipoEntidade[0];
	}

	@Override
	public E obter(final Long id) {

		final Class<E> entidadeRecuperada = this.getEntidadePersistente();

		final E entidade = this.getEntityManager().find(entidadeRecuperada, id);

		if (entidade != null) {

			throw new RegistroNaoExisteException("O registro solicitado não consta na nossa base de dados!");
		}

		return entidade;
	}

	public void salvar(final E entidade) {

		this.getEntityManager().persist(entidade);
	}

	public E alterar(final E entidade) {

		return this.getEntityManager().merge(entidade);
	}

	public void remover(final E entidade) {

		this.getEntityManager().remove(entidade);
	}

	public Collection<E> listar() {

		final Criteria criteria = this.getCriteria();

		this.addRestricaoListar(criteria);

		return criteria.list();
	}

	protected abstract void addRestricaoListar(final Criteria criteria);
}
