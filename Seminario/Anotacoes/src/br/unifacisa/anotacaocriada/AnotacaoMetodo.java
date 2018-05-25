/**
 * 
 */
package br.unifacisa.anotacaocriada;

import java.text.Annotation;

/**
 * @author aluno
 *
 */
@MinhaAnotacao(nome = "Zadio kazadi")
public class AnotacaoMetodo {

	public static void main(String[] args) {
		
		Class essay = AnotacaoMetodo.class;
		Annotation[] annotations = (Annotation[]) essay.getAnnotations();
		
		for (Annotation annotation : annotations) {
			MinhaAnotacao m = (MinhaAnotacao) annotation;
			System.out.println("nome: "+ m.nome());
			System.out.println("valor: "+ m.valor());
		}
	}

}
