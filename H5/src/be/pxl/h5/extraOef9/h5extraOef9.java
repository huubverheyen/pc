package be.pxl.h5.extraOef9;

import java.util.Scanner;

public class h5extraOef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int geboortedag;
		int geboortemaand;
		int geboortejaar;
		int huidigeDag;
		int huidigeMaand;
		int huidigJaar;

		System.out.println("Wat is je geboortedag?");
		geboortedag = keyboard.nextInt();
		System.out.println("Wat is je geboortemaand?");
		geboortemaand = keyboard.nextInt();
		System.out.println("Wat is je geboortejaar?");
		geboortejaar = keyboard.nextInt();
		System.out.println("Wat is de huidige dag?");
		huidigeDag = keyboard.nextInt();
		System.out.println("Wat is de huidige maand?");
		huidigeMaand = keyboard.nextInt();
		System.out.println("Wat is het huidig jaar?");
		huidigJaar = keyboard.nextInt();

		int leeftijd = huidigJaar - geboortejaar;

		if (huidigeMaand > geboortemaand) {
			leeftijd--;
		} else if (huidigeMaand == geboortemaand && huidigeDag > geboortedag) {
			leeftijd--;
		}
		System.out.println("leeftijd is: " + leeftijd);
		keyboard.close();
	}

}
