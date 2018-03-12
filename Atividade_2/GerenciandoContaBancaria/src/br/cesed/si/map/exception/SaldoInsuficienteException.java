/**
 * 
 */
package br.cesed.si.map.exception;

/**
 * @author Diego Kazadi
 *
 */
public class SaldoInsuficienteException extends Exception {

	/**
	 * @param message
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String  MENSAGEM = "O Saldo insuficiente para realizar esta operação";
	
	public SaldoInsuficienteException() {
		super(MENSAGEM);

	}

	
	
}