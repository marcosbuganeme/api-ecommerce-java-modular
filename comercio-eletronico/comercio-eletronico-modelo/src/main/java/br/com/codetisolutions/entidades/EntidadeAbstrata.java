package br.com.codetisolutions.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import br.com.codetisolutions.arquitetura.dominio.Entidade;

/**
 * <p>
 * <b>Organização:</b> 4code TI Solutions
 * </p>
 *
 * <p>
 * <b>Título:</b> EntidadeAbstrata.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe abstrata responsável por conter os atributos comuns para todas as entidades.
 * </p>
 *
 * Data de criação: 07/08/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@MappedSuperclass
public abstract class EntidadeAbstrata implements Entidade {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	/** Atributo id. */
	private Long id;

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.codetisolutions.arquitetura.dominio.Entidade#getIdentificador()
	 */
	@Override
	public Serializable getIdentificador() {

		return this.getId();
	}

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.codetisolutions.arquitetura.dominio.Entidade#isNovoRegistro()
	 */
	@Override
	public boolean isNovoRegistro() {

		return this.getIdentificador() == null;
	}

	/**
	 * Retorna o valor do atributo <code>id</code>
	 *
	 * @return <code>Long</code>
	 */
	public Long getId() {

		return id;
	}

	/**
	 * Define o valor do atributo <code>id</code>.
	 *
	 * @param id
	 */
	public void setId(Long id) {

		this.id = id;
	}

}
