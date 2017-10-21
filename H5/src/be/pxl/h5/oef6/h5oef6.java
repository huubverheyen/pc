package be.pxl.h5.oef6;

import java.util.Scanner;

public class h5oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("hoeveel artikels wil je bestellen?");
		int artikels = keyboard.nextInt();
		double eenheidsprijs = 11.5;
		double prijs = eenheidsprijs * artikels;
		double btw = prijs / 100 * 21; 
		double inclusiefBtw = btw + prijs;
		double reductie = inclusiefBtw - (inclusiefBtw / 100 * 10);
		
		if (inclusiefBtw > 1000) {
		System.out.println("u moet " + reductie + "betalen");
		}else {
			System.out.println("u moet " + inclusiefBtw + "betalen");
		}
		
		
		
		keyboard.close();
	}

}
