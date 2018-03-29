/**
 * 
 */
package br.edu.cesed.unifacisa.si.map;

/**
 * A classe Incremente
 * 
 * @author Criada por Diego em 29 de mar de 2018
 */
public class Incremente {

	private static int count = 0;
	private static int numero;

	private static Incremente inc = new Incremente();

	private Incremente() {

	}

	public String toString() {
		return "Incremental " + numero;
	}

	public static Incremente getIncremental() {
		numero = ++count;
		return inc;
	}
	public class TesteIncremental {
		public void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Incremental.getIncremental());
			}
		}
	}

}
