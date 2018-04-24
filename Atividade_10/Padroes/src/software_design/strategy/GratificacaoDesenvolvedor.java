/**
 * 
 */
package software_design.strategy;

/**
 * @author aluno
 *
 */

public class GratificacaoDesenvolvedor implements Gratificacao {
            @Override
            public double calcularGratificacao(Funcionario umFuncionario) {
                  Object getNivel;
				if (umFuncionario.getNivel() >= 2) {
                      return umFuncionario.getSalarioBase() * 1.25;
                  }
                  return umFuncionario.getSalarioBase() * 1.15;
            }
}