package br.com.ecommerce.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ecommerce.modelo.enuns.EnumStatus;

@MappedSuperclass
public class ModelSupport implements Entidade {

	private static final long serialVersionUID = 3987365413643702140L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private EnumStatus status;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_criacao")
	private Date criacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_modificacao")
	private Date modificacao;

	@PrePersist
	@PreUpdate
	private void executar() {

		if (this.criacao == null) {

			status = EnumStatus.ATIVO;

			this.criacao = new Date();
		}

		this.modificacao = new Date();
	}

	@Override
	public Long getID() {

		return this.id;
	}

	@Override
	public boolean isNovo() {

		return this.getID() == null;
	}

	public EnumStatus getStatus() {
		return status;
	}

	public Date getCriacao() {
		return criacao;
	}

	public Date getModificacao() {
		return modificacao;
	}

	@Override
	public int hashCode() {

		final int prime = 31;

		int resultado = 1;

		resultado = prime * resultado + ((id == null) ? 0 : id.hashCode());

		return resultado;
	}

	@Override
	public boolean equals(final Object objeto) {

		if (this == objeto) {

			return true;
		}

		if (objeto == null) {

			return false;
		}

		if (!(objeto instanceof ModelSupport)) {

			return false;
		}

		final ModelSupport other = (ModelSupport) objeto;

		if (id == null) {

			if (other.id != null) {

				return false;
			}

		} else if (!id.equals(other.id)) {

			return false;
		}

		return true;
	}

}
