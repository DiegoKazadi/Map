package br.cesed.unifacisa.si.map;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Obser> observers = new ArrayList<>();
	private int state;

	public void add(Obser o) {
		observers.add(o);
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		execute();
	}

	private void execute() {
		for (Obser observer : observers) {
			observer.update();
		}
	}

}
