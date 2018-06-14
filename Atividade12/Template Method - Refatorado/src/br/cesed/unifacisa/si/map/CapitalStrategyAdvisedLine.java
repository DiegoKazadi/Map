package br.cesed.unifacisa.si.map;

public class CapitalStrategyAdvisedLine extends CapitalStrategy {

	@Override
	public double calcStrategyCapital(Lan lan) {
		
		return lan.getCommitment() * lan.getUnPercentage();
		
	}

}
