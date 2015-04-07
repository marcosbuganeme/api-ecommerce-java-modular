package br.com.ecommerce.servico.exception;

public class RegistroNaoExisteException extends NegocioException {

	private static final long serialVersionUID = 8122570466018595988L;

	public RegistroNaoExisteException() {
	}

	public RegistroNaoExisteException(final String mensagem) {
		super(mensagem);
	}

	public RegistroNaoExisteException(final String mensagem, final Throwable causa) {
		super(mensagem, causa);
	}

	public RegistroNaoExisteException(final Throwable causa) {
		super(causa);
	}
}
