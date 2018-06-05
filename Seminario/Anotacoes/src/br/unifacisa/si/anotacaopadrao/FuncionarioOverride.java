/**
 * 
 */
package br.unifacisa.si.anotacaopadrao;

/**
 * @author aluno
 *
 */
public class FuncionarioOverride {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [salario=");
		builder.append(salario);
		builder.append("]");
		
		return builder.toString();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioOverride other = (FuncionarioOverride) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
