/**
 * 
 */
package br.cesed.unifacisa.br.si.map.strategy;

/**
 * @author aluno
 *
 */
public class Funcionario {
	
	/**
	 * Definicao dos Atributos da classe Funcionario
	 */
	private String nome;
	private Strategy cargo;
	private double comissao;
	
	
	/**
	 * O method construtor do funcionario que permitirá que o funcionario seja instanciado 
	 * com dois parametros nome e o cargo
	 *
	 * 
	 * @param nome
	 * @param cargo
	 */
	public Funcionario(String nome, Strategy cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}
	

	/**
	 * Esse method recebe tres parametros diferente do method 
	 * anterior, ele recebe mais um parametro comissao
	 * @param nome
	 * @param cargo
	 * @param comissao
	 */
	public Funcionario(String nome, Strategy cargo, double comissao) {
		this.nome = nome;
		this.cargo = cargo;
		this.comissao = comissao;
	}


	/**
	 * 
	 * @return
	 */
	
	public double getComissao() {
		// TODO Auto-generated method stub
		return comissao;
	}

	/**
	 * @return the nome do funcionario
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cargo
	 */
	public Strategy getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(Strategy cargo) {
		this.cargo = cargo;
	}

	/**
	 * @param comissao the comissao to set
	 */
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
