package br.cesed.unifacisa.si.map;

import java.util.Scanner;

public class ObserDemo {

	public static void main(String[] args) {
		
		Subject sub = new Subject();
		
		new HexObser(sub);
		new OctObser(sub);
		new BinObser(sub);
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}

	}

}
