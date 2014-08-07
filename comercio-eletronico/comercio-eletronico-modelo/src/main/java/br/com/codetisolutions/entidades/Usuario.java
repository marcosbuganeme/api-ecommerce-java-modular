package br.com.codetisolutions.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * <b>Organiza��o:</b> 4code TI Solutions
 * </p>
 *
 * <p>
 * <b>T�tulo:</b> Usuario.java
 * </p>
 *
 * <p>
 * <b>Descri��o:</b> Classe respons�vel por abstrair as caracteristicas do usu�rio para o sistema.
 * </p>
 *
 * Data de cria��o: 07/08/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends EntidadeAbstrata {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3347961561015843994L;

	@Column(name = "NOME")
	/** Atributo nome. */
	private String nome;

	@Column(name = "EMAIL")
	/** Atributo email. */
	private String email;

	@Column(name = "LOGIN")
	/** Atributo login. */
	private String login;

	@Column(name = "SENHA")
	/** Atributo senha. */
	private String senha;

	/**
	 * Respons�vel pela cria��o de novas inst�ncias desta classe.
	 */
	public Usuario() {

	}

	/**
	 * Respons�vel pela cria��o de novas inst�ncias desta classe.
	 * 
	 * @param nome
	 *            - nome completo do usu�rio.
	 * 
	 * @param email
	 *            - email v�lido do usu�rio.
	 * 
	 * @param login
	 *            - login do usu�rio.
	 * 
	 * @param senha
	 *            - senha do usu�rio.
	 */
	public Usuario( final String nome, final String email, final String login, final String senha ) {

		this.nome = nome;

		this.email = email;

		this.login = login;

		this.senha = senha;
	}

	/**
	 * Retorna o valor do atributo <code>nome</code>
	 *
	 * @return <code>String</code>
	 */
	public String getNome() {

		return this.nome;
	}

	/**
	 * Define o valor do atributo <code>nome</code>.
	 *
	 * @param nome
	 */
	public void setNome(final String nome) {

		this.nome = nome;
	}

	/**
	 * Retorna o valor do atributo <code>email</code>
	 *
	 * @return <code>String</code>
	 */
	public String getEmail() {

		return this.email;
	}

	/**
	 * Define o valor do atributo <code>email</code>.
	 *
	 * @param email
	 */
	public void setEmail(final String email) {

		this.email = email;
	}

	/**
	 * Retorna o valor do atributo <code>login</code>
	 *
	 * @return <code>String</code>
	 */
	public String getLogin() {

		return this.login;
	}

	/**
	 * Define o valor do atributo <code>login</code>.
	 *
	 * @param login
	 */
	public void setLogin(final String login) {

		this.login = login;
	}

	/**
	 * Retorna o valor do atributo <code>senha</code>
	 *
	 * @return <code>String</code>
	 */
	public String getSenha() {

		return this.senha;
	}

	/**
	 * Define o valor do atributo <code>senha</code>.
	 *
	 * @param senha
	 */
	public void setSenha(final String senha) {

		this.senha = senha;
	}

}
