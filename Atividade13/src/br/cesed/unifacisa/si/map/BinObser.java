package br.cesed.unifacisa.si.map;

public class BinObser extends Obser {
	
	public BinObser(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toBinaryString(subject.getState()));
	}
	
}
