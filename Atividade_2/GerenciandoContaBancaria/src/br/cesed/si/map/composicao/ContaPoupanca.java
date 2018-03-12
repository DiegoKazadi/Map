/**
 * 
 */
package br.cesed.si.map.composicao;

import br.cesed.si.map.abstrat.Conta;
import br.cesed.si.map.exception.SaldoInsuficienteException;
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
	 */
	public ContaPoupanca(int agencia, int conta, double saldo, String titular)
	
		throws SaldoInsuficienteException {
		super(agencia, conta, saldo, titular);
	}

	/**
	 * @return the juros
	 */
	@Override
	public double deposito(double montante) throws SaldoInsuficienteException {

		if (montante <= 0) {
			throw new SaldoInsuficienteException();
		}

		double saldoAtual = this.getSaldo();

		saldoAtual += montante;

		this.setSaldo(saldoAtual);


		return this.getSaldo();

	}
	@Override
	public double sacar(double montante) throws SaldoInsuficienteException {

		double saldoAtual = this.getSaldo();

		if (montante <= 0 || montante > getSaldo()) {
			
			throw new SaldoInsuficienteException();
		}

		saldoAtual -= montante;
		this.setSaldo(saldoAtual);

		return this.getSaldo();

	}
	
}

