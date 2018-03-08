/**
 * 
 */
package br.cesed.si.map.abstrat;

import br.cesed.si.map.exception.Conta;

/**
 * @author aluno
 *
 */
public class ContaPoupanca extends Conta {
	private int juros;
	
	/**
	 * @param agencia
	 * @param conta
	 * @param saldo
	 * @param titular
	 * @param juros
	 */
	public ContaPoupanca(int agencia, int conta, double saldo, String titular, int juros) {
		super(agencia, conta, saldo, titular);
		this.juros = juros;
	}

	/**
	 * @return the juros
	 */
	public int getJuros() {
		return juros;
	}

	/**
	 * @param juros the juros to set
	 */
	public void setJuros(int juros) {
		this.juros = juros;
	}

	@Override
	public void sacar(double montante) {
		// TODO implementando o m�todo sacar
		
	}
	
}