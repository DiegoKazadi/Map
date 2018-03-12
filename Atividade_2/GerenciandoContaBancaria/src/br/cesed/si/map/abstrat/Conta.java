/**
 * 
 */
package br.cesed.si.map.abstrat;

import br.cesed.si.map.exception.SaldoInsuficienteException;

/**
 * @author Diego
 *
 */
public abstract class Conta {
	// Variables
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	private static double taxaIFN = 0.03;
	/**
	 * @param agencia
	 * @param conta
	 * @param saldo
	 * @param titular
	 */
	public Conta(int agencia, int conta, double saldo, String titular) {
		super();
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
	public Conta(int agencia, int conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
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
	
	public void depositar(double montante) {
		this.saldo += montante;
	}
	
	public abstract double sacar(double montante) throws SaldoInsuficienteException;
	public double deposito(double montante) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
