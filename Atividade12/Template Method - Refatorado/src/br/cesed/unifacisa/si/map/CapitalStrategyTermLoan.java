package br.cesed.unifacisa.si.map;

public class CapitalStrategyTermLoan extends CapitalStrategy {

	@Override
	public double calcStrategyCapital(Lan lan) {
		
		return lan.getCommitment();
		
	}
	
	@Override
	public double duration(Lan lan) {
		
		return 0;
		
	}
	
}
