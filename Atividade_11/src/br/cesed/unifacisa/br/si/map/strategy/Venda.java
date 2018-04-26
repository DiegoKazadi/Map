/**
 * 
 */
package br.cesed.unifacisa.br.si.map.strategy;

/**
 * @author aluno diego kazadi
 * @commite Essa classe Venda onde terá alguns atributos
 * 
 *
 */
public class Venda {
	/**
	 * Alguns atributos da classe venda
	 * 
	 */
	private double valorVenda;
	private Funcionario funcionario;
	private double valorComissao;
	/**
	 * @param valorVenda
	 * @param funcionario
	 * @param valorComissao
	 */
	public Venda(double valorVenda, Funcionario funcionario) {
		this.valorVenda = valorVenda;
		this.funcionario = funcionario;
	}
	/**
	 * @return the valorVenda
	 */
	public double getValorVenda() {
		return valorVenda;
	}
	/**
	 * @param valorVenda the valorVenda to set
	 */
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}
	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	/**
	 * @return the valorComissao
	 */
	public double getValorComissao() {
		return valorComissao;
	}
	/**
	 * @param valorComissao the valorComissao to set
	 */
	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	
	public void relatorioVenda() {
		this.valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
		this.funcionario.setComissao(this.funcionario.getComissao() + this.valorComissao);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Venda [valorVenda=" + valorVenda + ", funcionario=" + funcionario + ", valorComissao=" + valorComissao
				+ "]";
	}
			
}
