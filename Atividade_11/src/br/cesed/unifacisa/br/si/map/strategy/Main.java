/**
 * 
 */
package br.cesed.unifacisa.br.si.map.strategy;

/**
 * @author aluno diego kazadi
 *
 */
public class Main {

	private static final Strategy Encargo = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario gerente = new Funcionario("Diego", Encargo.gerente);
		Funcionario gerente1 = new Funcionario("Capo", Encargo.gerente,100);
		Funcionario atendente = new Funcionario("Alexia", Encargo.vendedor);
		Funcionario vendedor = new Funcionario("Angeline", Encargo.atendete);
		
		// usar todos encargos instaciados
		
		Venda venda = new Venda(250, atendente);
		//venda.relatorioVenda();
		System.out.println(atendente.getComissao());
		
		venda = new Venda(250, vendedor);
		//venda.relatorioVenda();
		System.out.println(vendedor.getComissao());
		
		venda = new Venda(200, gerente1);
		//venda.relatorioVenda();
		System.out.println(gerente1.getComissao());
		
		venda = new Venda(200, gerente);
		venda.relatorioVenda();
		System.out.println(gerente.getComissao());
	}

}
