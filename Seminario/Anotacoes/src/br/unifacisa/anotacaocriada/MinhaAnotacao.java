/**
 * 
 */
package br.unifacisa.anotacaocriada;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author aluno
 *
 */
@Retention(RetentionPolicy.RUNTIME) // Indica o acesso de anota��o durante a execu��o
@Target(ElementType.TYPE) // Definindo que anota��o ser� usado no tpo da classe quando usamos Type
public @interface MinhaAnotacao {
	
	public String nome() default "";
	
	public String valor() default "Bem vindo";

}
