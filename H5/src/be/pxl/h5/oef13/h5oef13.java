package be.pxl.h5.oef13;

import java.util.Scanner;

public class h5oef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Voer een getal in tussen de 0 en 100");
		int getal = keyboard.nextInt();
		while (getal < 1 || getal > 100) {
			if (getal < 1) {
				System.out.println("Fout! Het getal moet groter zijn dan 1");
				getal = keyboard.nextInt();
			} else {
				if (getal > 100) {
					System.out.println("Fout! Het getal moet kleiner zijn dan 100");
					getal = keyboard.nextInt();
				} else {
					System.out.println(getal);
				}

			}
		}
		keyboard.close();
	}

}
