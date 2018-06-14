package br.cesed.unifacisa.si.map;

public abstract class CapitalStrategy {

	public double capital(Lan lan) {
		
		return  duration(lan) * riskFactorFor(lan) * calcStrategyCapital(lan);
	}
	
	
	public abstract double calcStrategyCapital(Lan lan);
	
	public double duration(Lan lan) {

		return 0;

	}

	protected double riskFactorFor(Lan lan) {

		return 0;

	}

}
