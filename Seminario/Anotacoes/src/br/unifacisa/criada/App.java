/**
 * 
 */
package br.cesed.unifacisa.map.annotaion.criada;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author 
 *
 */
public class App {
	
	public void print(ArrayList<Usuario> usuarios) {
		
		System.out.println("Listagem de usuários:");
		
		try{
			
			for (Usuario usuario: usuarios){
				StringBuilder usuarioData = new StringBuilder();
				
				for (Method method : usuario.getClass().getDeclaredMethods()){
					
					if (method.isAnnotationPresent(Printable.class)){
						Printable printableMeta = method.getAnnotation(Printable.class);
						
						usuarioData.append(printableMeta.label()).append(":").append(method.invoke(usuario)).append(",");
						
					}
					System.out.println(usuarioData.toString());
				}
				
			}
		} catch (Exception e){
			System.out.println("Error!");
		}
	}

}
