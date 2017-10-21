package be.pxl.h5.oef3;

import java.util.Scanner;

public class h5oef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Wat zijn aantal afgelegde kilometers per jaar?");
		int afgKm = input.nextInt();
		System.out.println("wat is het verbruik in l per 100KM?");
		double verbruik = input.nextDouble();
		System.out.println("Wat is de prijs van 1L brandstof?");
		double prijsL = input.nextDouble();
		
		double verbruikPerJaar = afgKm * verbruik / 100 * prijsL;
		double kostprijsKm = (verbruik / 100) * prijsL;
		System.out.println("Het totale verbruik per jaar is " + verbruikPerJaar);
		System.out.println("De kostprijs per KM" + kostprijsKm);
		
		input.close();
	}

}
