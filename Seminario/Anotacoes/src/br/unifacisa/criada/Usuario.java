/**
 * 
 */
package br.cesed.unifacisa.map.annotaion.criada;

/**
 * @author 
 *
 */
public class Usuario {

	protected String nome;
	protected int idade;
	protected String email;
	protected String senha;
	
	/**
	 * @return the nome
	 */
	@Printable(label = "Nome")
	
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the idade
	 */
	@Printable(label = "Idade")
	
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the email
	 */
	@Printable(label = "Email")
	
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
