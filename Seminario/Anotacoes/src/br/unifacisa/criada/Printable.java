/**
 * 
 */
package br.cesed.unifacisa.map.annotaion.criada;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
/**
 * @author 
 *
 */
public @interface Printable {
	
	String label();

}
