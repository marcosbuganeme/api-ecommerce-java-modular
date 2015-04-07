package br.com.ecommerce.modelo;

import java.io.Serializable;

public interface Entidade extends Serializable {

	Long getID();

	boolean isNovo();
}
