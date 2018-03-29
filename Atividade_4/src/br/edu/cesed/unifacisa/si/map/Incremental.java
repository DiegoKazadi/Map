package br.edu.cesed.unifacisa.si.map;

/**
 * 
 * A classe Incremental  
 * @author Diego em 29 de mar de 2018.
 */
public class Incremental {

	private static int count = 0;
	private static int numero;

	private static Incremental inc = new Incremental();

	private Incremental() {

	}

	public String toString() {
		return "Incremental " + numero;
	}

	/**
	 * 
	 * @return Incremental objeto instanciado pela classe {@link Incremental}.
	 */
	public static Incremental getIncremental() {
		numero = ++count;
		return inc;
	}
}
