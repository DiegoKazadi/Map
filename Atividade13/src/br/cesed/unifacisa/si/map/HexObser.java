package br.cesed.unifacisa.si.map;

public class HexObser extends Obser{

	public HexObser(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

	public void update() {
		System.out.print(" " + Integer.toHexString(subject.getState()));
	}

}
