/**
 * 
 */
package br.cesed.unifacisa.br.si.map.strategy;

/**
 * @author aluno diego kazadi
 * A classe Cargo do tipo enum que contem os diferentes
 * cargos a ser calculado.
 *
 */
public enum Encargo implements Strategy {
	atendente{
		@Override
		public double calcularComissao(double valorVenda) {
			return (valorVenda * 0.01);
		}
	},
	
	vendedor{
		
		@Override
		public double calcularComissao(double valorVenda) {
			// TODO Auto-generated method stub
			return (valorVenda * 0.02);
		}
	},
	gerente{
		@Override
		public double calcularComissao(double valorVenda) {
			return (100 + valorVenda * 0.03);
		}
		
	};
	
}
