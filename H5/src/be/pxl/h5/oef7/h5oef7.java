package be.pxl.h5.oef7;

import java.util.Scanner;

public class h5oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de klasse van de vlucht");
		int klasse = keyboard.nextInt();
		System.out.println("Geef afsand van de vlucht weer in km");
		int afstand = keyboard.nextInt();

		double prijs;

		if (afstand >= 3000) {
			prijs = 0.12;
		} else {
			if (afstand >= 1000) {
				prijs = 0.20;
			} else {
				prijs = 0.25;
			}
		}

		double prijsAfstand = prijs * afstand;
		int totaalprijs = 0;
		double percentage1 = (prijsAfstand * 20) / 100;
		double percentage2 = (prijsAfstand * 30) / 100;

		if (klasse == 1) {
			totaalprijs = (int) prijsAfstand;
		} else {
			if (klasse == 2) {
				totaalprijs = (int) (prijsAfstand - percentage1);

			} else {
				if (klasse == 3) {
					totaalprijs = (int) (prijsAfstand + percentage2);

				}

			}
		}

		System.out.println("Het vliegticket kost :" + totaalprijs + " euro ");

		keyboard.close();
	}
}

