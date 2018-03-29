/**
 * 
 */
package br.edu.cesed.unifacisa.si.map.factorymethod;

/**
 * A classe Creer criada no pacote br.edu.cesed.unifacisa.si.map para o projeto Atividade_3
 * 
 * @author Criada por Diego Kazadi em 29 de mar de 2018
 */
/**
 * Example of parameterized factory method.
 * 
 * More information:
 * <ul>
 * <li>https://www.safaribooksonline.com/library/view/head-first-design/0596007124/ch04.html
 * <li>http://www.oodesign.com/factory-pattern.html
 * </ul>
 */
class Parameterized {
	private Parameterized() {
	}
	// Interfaces.
	private interface Car {
		String showInfo();
	}
	private enum Type {
		HATCH, SEDAN;
	}

	private abstract static class CarFactory {
		abstract Car createCar(Type type);

		void deliver(Car car, String place) {
			System.out.println("Delivering " + car.showInfo() + " to " + place);
		}
	}
	// Implementation.
	private static class Palio implements Car {
		public String showInfo () {	return "Palio. Hatch from Fiat";
		}
	}
	private static class Siena implements Car {
		public String showInfo() { return "Siena. Sedan from Fiat"; }
		
	}
	private static class Fiat extends CarFactory {
		Car createCar(Type type) {
			switch (type) {
			case HATCH:
				return new Palio();
			case SEDAN:
				return new Siena();
			default:
				throw new IllegalArgumentException();
			}
		}
	}
	/**
	 * 
	 * A classe  criada Elantra 
	 * 
	 * @author Criada por Diego em 29 de mar de 2018
	 */
	private static class Elantra implements Car {
		public String showInfo() {
			return "Elantra. Sedan from Hyundai";
		}
	}
	/**
	 * 
	 * A classe Hb20 
	 * 
	 * @author  por Diego em 29 de mar de 2018
	 */
	private static class Hb20 implements Car {
		public String showInfo() {
			return "Hb20. Hatch from Hyundai";
		}
	}
	/**
	 * 
	 * A classe Hyundai 
	 * 
	 * @author Diego em 29 de mar de 2018
	 */
	private static class Hyundai extends CarFactory {

		@Override
		Car createCar(Type type) {
			switch (type) {
			case HATCH:
				return new Hb20();
			case SEDAN:
				return new Elantra();
			default:
				throw new IllegalArgumentException();
			}
		}
	// implementando a fabrica
	
	public static void main(String[] args) {
		Parameterized.CarFactory fiat = new Parameterized.Fiat();
		System.out.println("Fiat factory creates " + fiat.createCar(Type.HATCH).showInfo());
		System.out.println("Fiat factory creates " + fiat.createCar(Type.SEDAN).showInfo());
		Parameterized.CarFactory hyundai = new Parameterized.Hyundai();
		System.out.println("Hyundai factory Elantra " + hyundai.createCar(Type.HATCH).showInfo());
		System.out.println("Hyundai factory Elantra " + hyundai.createCar(Type.SEDAN).showInfo());
		}
	}
}

