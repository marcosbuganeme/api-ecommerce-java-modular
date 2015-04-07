package br.com.ecommerce.servico.exception;

public class RegistroJaExisteException extends NegocioException {

	private static final long serialVersionUID = 4070532582304382254L;

	public RegistroJaExisteException() {
	}

	public RegistroJaExisteException(final String mensagem) {

		super(mensagem);
	}

	public RegistroJaExisteException(final String mensagem, final Throwable causa) {

		super(mensagem, causa);
	}

	public RegistroJaExisteException(final Throwable causa) {

		super(causa);
	}
}
