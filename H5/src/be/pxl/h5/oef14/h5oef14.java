package be.pxl.h5.oef14;

import java.util.Scanner;

public class h5oef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		

		int artikelnummer, hoeveelheid;
		double eenheidsprijs, totaal;
		
		System.out.println("Geef het artikelnummer in:");
		artikelnummer = keyboard.nextInt();
		
		while (artikelnummer != 999) {
			
			System.out.println("Geef de hoeveelheid in, vul 999 in om te eindigen");
			hoeveelheid = keyboard.nextInt();
			
			System.out.println("Geef de eenheidsprijs in:");
			eenheidsprijs = keyboard.nextDouble();
			
			System.out.println("Het artikelnummer is " + artikelnummer);
			System.out.println("De hoeveelheid is " + hoeveelheid);
			System.out.println("De eenheidsprijs is " + eenheidsprijs);
			
			totaal = (hoeveelheid * eenheidsprijs);
			System.out.println("Het bedrag is �" + totaal);
			
			System.out.println("Geef het artikelnummer in:");
			artikelnummer = keyboard.nextInt();
		
		}
		
		keyboard.close();
	}

}
