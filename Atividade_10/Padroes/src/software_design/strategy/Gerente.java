/**
 * 
 */
package software_design.strategy;

/**
 * @author aluno
 *
 */
public class Gerente implements Gratificacao{
	
	public double calcularGratificacao (Gerente umGerente) {
		if (umGerente.getNivel() >= 2 ) {
			 return umGerente.getSalarioBase() * 1.35;
		}
		return 0;
	}

private int getNivel() {
		// TODO Auto-generated method stub
		return 0;
	}

private double getSalarioBase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularGratificacao(Funcionario umFuncionario) {
		// TODO Auto-generated method stub
		return 0;
	}
}