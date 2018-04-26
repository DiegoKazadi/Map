/**
 * 
 */
package br.cesed.unifacisa.br.si.map.strategy;

/**
 * @author aluno diego kazadi
 * @ref https://pt.wikipedia.org/wiki/Strategy	
 *
 */
public interface Strategy {
	Strategy atendete = null;
	Strategy vendedor = null;
	Strategy gerente = null;

	/**
	 * Definicao de method calcularComissao() que será implementado na outra classe que implements Strategy
	 * esse method calcula o valor da venda e tem como tipo double
	 * 
	 * @param valorVenda que sera calculado;
	 * 
	 */
	public double calcularComissao(double valorVenda);

}
