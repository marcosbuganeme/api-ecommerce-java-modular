package br.com.ecommerce.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.modelo.Usuario;
import br.com.ecommerce.modelo.enuns.EnumStatus;
import br.com.ecommerce.repository.UsuarioDAO;

@Repository
public class UsuarioHibernateDAO extends HibernateDAO<Usuario> implements UsuarioDAO {

	private static final long serialVersionUID = -7201679256632742926L;

	@PersistenceContext(unitName = "ecommercePU")
	private EntityManager manager;

	@Override
	protected void addRestricaoListar(final Criteria criteria) {

		criteria.add(Restrictions.eq("status", EnumStatus.ATIVO));
	}

	@Override
	protected EntityManager getEntityManager() {

		return this.manager;
	}

}
