/**
 * 
 */
package software_design.strategy;

/**
 * @author aluno
 *
 */
/* Exemplo inspirado no exemplo do Marcos Brizeno 
 * https://brizeno.wordpress.com/category/padroes-de-projeto/strategy/
 */
public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int DBA = 2;
	public static final int LIDER = 3;
	protected double salarioBase;
	protected int cargo;
        protected int nivel;
	protected Gratificacao estrategiaDeGratificacao;

	public Funcionario(int cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		switch (cargo) {
		case DESENVOLVEDOR:
			estrategiaDeGratificacao = new GratificacaoDesenvolvedor();
			cargo = DESENVOLVEDOR;
			break;
		case DBA:
			estrategiaDeGratificacao = new GratificacaoDesenvolvedor();
			cargo = DBA;
			break;
		case LIDER:
			estrategiaDeGratificacao = new GratificacaoLider();
			cargo = DBA;
			break;
		default:
			throw new RuntimeException("Cargo n�o encontrado :/");
		}
	}

	public double calcularGratificacao() {
		return estrategiaDeGratificacao.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}

	
}