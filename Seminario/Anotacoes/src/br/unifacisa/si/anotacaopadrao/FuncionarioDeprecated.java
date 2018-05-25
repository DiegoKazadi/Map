/**
 * 
 */
package br.unifacisa.si.anotacaopadrao;

/**
 * A classe Funcionario usando anotação Deprecated
 * @author aluno
 *
 */
public class FuncionarioDeprecated {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	/**
	 * Com anotação @Deprecated o método getSalarioTotal não 
	 * deveria mais ser usado
	 * 
	 * @param bonus
	 * @return
	 */
	@Deprecated public double getSalarioTotal (double bonus) {
		return this.salario + bonus;
	}
	
	public double getTotalSalario (double bonus) {
		return this.salario + bonus;
	}
}
