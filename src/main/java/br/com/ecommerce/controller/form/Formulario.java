package br.com.ecommerce.controller.form;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import br.com.ecommerce.modelo.Entidade;

@SuppressWarnings("unchecked")
public abstract class Formulario<E extends Entidade> implements Serializable {

	private static final long serialVersionUID = 666982428972779056L;

	private E entidade;

	private E consulta;

	private Collection<E> dadosConsulta;

	private Class<E> getTipoEntidade() {

		final Type[] tipoEntidade = ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments();

		return (Class<E>) tipoEntidade[0];
	}

	public Formulario(final Class<E> clazz) {

		try {

			this.entidade = clazz.newInstance();

			this.consulta = clazz.newInstance();

		} catch (Exception e) {

		}
	}

	public <T> Formulario() {

		try {

			this.entidade = this.getTipoEntidade().newInstance();

			this.consulta = this.getTipoEntidade().newInstance();

		} catch (Exception e) {

		}

	}

	public E getEntidade() {
		return entidade;
	}

	public void setEntidade(E entidade) {
		this.entidade = entidade;
	}

	public E getConsulta() {
		return consulta;
	}

	public void setConsulta(E consulta) {
		this.consulta = consulta;
	}

	public Collection<E> getDadosConsulta() {
		return dadosConsulta;
	}

	public void setDadosConsulta(Collection<E> dadosConsulta) {
		this.dadosConsulta = dadosConsulta;
	}
}
