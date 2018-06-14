package br.cesed.unifacisa.si.map;

public class CapitalStrategyRevolver extends CapitalStrategy {

	@Override
	public double capital(Lan lan) {
		
		return calcStrategyCapital(lan);
		
	}

	@Override
	public double calcStrategyCapital(Lan lan) {

		return lan.outstandingRiskAmount() * duration(lan) * riskFactorFor(lan)
				+ (lan.unRiskAmount() * duration(lan) * unusedRiskFactory(lan));
		
	}
	
	public double unusedRiskFactory(Lan lan) {
		
		return 0;
		
	}


}
