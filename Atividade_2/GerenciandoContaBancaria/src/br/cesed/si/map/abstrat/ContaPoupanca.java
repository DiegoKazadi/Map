/**
 * 
 */
package br.cesed.si.map.abstrat;

/**
 * @author aluno
 *
 */
public class ContaPoupanca extends Conta {
	private int juros;
	private double saldo;
	
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
	public double sacar(double montante) {
		// TODO implementando o método sacar
		if(montante > 0) {
			if (saldo >= montante) {
				saldo -= montante;
			}else {
				System.out.println("Saldo Disponivel é:" + (this.saldo));
			}			
			
		}else {
			System.out.println("O montante do saque deve ser positivo");
		}
		return montante;
		
	}
	public void deposita(double montante) {
		this.saldo += montante;
		System.out.println("operação realizada com sucesso teu saldo é "+ (this.saldo));
	}
	
}
