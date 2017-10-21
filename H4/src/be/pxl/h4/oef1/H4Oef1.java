package be.pxl.h4.oef1;

import java.util.Scanner;

public class H4Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Met hoeveel volwassenen zijn jullie? ");
		int aantalVolwassene = keyboard.nextInt();

		System.out.println("Met hoeveel kinderen zijn jullie? ");
		int aantalKinderen = keyboard.nextInt();

		int totaalPrijs = (aantalVolwassene * 28) + (aantalKinderen * 15);

		System.out.println("De totale inkoopprijs is " + totaalPrijs);
		keyboard.close();
	}

}
