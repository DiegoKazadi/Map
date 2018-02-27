/**
 * 
 */
package br.cesed.si.p3.classes;

import br.cesed.si.p3.contas.Conta;

/**
 * @author Diego Kazadi
 *
 */
public class ContaCorrente extends Conta{
	// variables
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	
	/**
	 * @param agencia
	 * @param conta
	 * @param saldo
	 * @param titular
	 */
	public ContaCorrente(int agencia, int conta, double saldo, String titular) {
		super(conta, conta, saldo, titular);
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 */
	public ContaCorrente(int agencia, int conta, String titular) {
		super(conta, conta, titular);
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}
	
	/**
	 * @param agencia
	 * @param conta
	 * @param saldo
	 * @param titular
	 * @param agencia2
	 * @param conta2
	 * @param saldo2
	 * @param titular2
	 */
	public ContaCorrente(int agencia, int conta, double saldo, String titular, int agencia2, int conta2, double saldo2,
			String titular2) {
		super(agencia, conta, saldo, titular);
		agencia = agencia2;
		conta = conta2;
		saldo = saldo2;
		titular = titular2;
	}

	public void sacar(double montante){
		if (saldo >= montante){
			saldo -= montante;
		}else{
			 
		}
		
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public void depositar(double montante) {
		// TODO Auto-generated method stub
		
	}

}
