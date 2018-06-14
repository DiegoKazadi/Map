package br.cesed.unifacisa.si.map;

public class OctObser extends Obser{

	public OctObser(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toOctalString(subject.getState()));
	}
}
