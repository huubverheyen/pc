package be.pxl.h4.oef3;

import java.util.Scanner;

public class H4oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int aantal;
		int eenheidsPrijs;
		int totaalPrijs;
		int korting;
		int teBetalenPrijs;

		System.out.println("aantal? ");
		aantal = keyboard.nextInt();

		System.out.println("eenheidsprijs? ");
		eenheidsPrijs = keyboard.nextInt();

		totaalPrijs = aantal * eenheidsPrijs;

		if (totaalPrijs < 500) {
			korting = 0;
		} else {
			if (totaalPrijs < 1000) {
				korting = 10;
			} else {
				korting = 22;
			}
		}
		teBetalenPrijs = totaalPrijs - korting;
		System.out.println("De totaalprijs bedraagt " + teBetalenPrijs + " euro");
		keyboard.close();
	}

}
