package com.gft.socialbooks.services.exceptions;

public class LivroNãoEncontradoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6036093663613413346L;

	public LivroNãoEncontradoException (String mensagem) {
		super(mensagem);
	}
	
	public LivroNãoEncontradoException (String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
