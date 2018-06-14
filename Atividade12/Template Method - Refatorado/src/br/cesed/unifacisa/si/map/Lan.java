package br.cesed.unifacisa.si.map;

public class Lan {

	private double commitment;
	private double unPercentage;

	
	public Lan(double commitment, double unPercentage) {
		
		this.commitment = commitment;
		this.unPercentage = unPercentage;
	}

	public double outstandingRiskAmount() {

		return 0;

	}

	public double unRiskAmount() {

		return 0;

	}

	public double getCommitment() {

		return commitment;

	}

	public void setCommitment(double commitment) {

		this.commitment = commitment;

	}

	public double getUnPercentage() {

		return unPercentage;

	}
	public void setUnusedPercentage(double unPercentage) {

		this.unPercentage = unPercentage;

	}

}
