package br.com.ecommerce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "usuario")
public class Usuario extends ModelSupport {

	@Transient
	private static final long serialVersionUID = 1863776568633285684L;

	@Column
	private String nome;

	@Column
	private String email;

	public Usuario() {

	}

	public Usuario(final String nome, final String email) {

		this.nome = nome;

		this.email = email;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}
}