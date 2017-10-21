package be.pxl.h5.oef11;

import java.util.Scanner;

public class h5oef11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int som = 0;
		int negatief = 0;
		System.out.println("Geef een getal in. Om te eindigen 0");
		int getal = keyboard.nextInt();
		while (getal != 0) {
			som = som + getal;
			if (getal < 0) {
				negatief++;
			}
			System.out.println("Geef een getal in");
			getal = keyboard.nextInt();

		}
		System.out.println("De som is" + som);
		System.out.println("Aantal negatieve getallen: " + negatief);
		keyboard.close();
	}

}
