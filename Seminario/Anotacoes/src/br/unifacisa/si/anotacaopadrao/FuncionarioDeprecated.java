/**
 * 
 */
package br.unifacisa.si.anotacaopadrao;

/**
 * A classe Funcionario usando anota��o Deprecated
 * @author aluno
 *
 */
public class FuncionarioDeprecated {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	/**
	 * Com anota��o @Deprecated o m�todo getSalarioTotal n�o 
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
