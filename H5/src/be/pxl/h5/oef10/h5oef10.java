package be.pxl.h5.oef10;

import java.util.Scanner;

public class h5oef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Wat is uw bruto jaarwedde?");
		double jaarwedde = keyboard.nextDouble();
		System.out.println("Geef de beoordelingscode");
		int beoordelingscode = keyboard.nextInt();
		
		double premiebedrag = jaarwedde / 20;
		
		switch (beoordelingscode) {
		case 1:
			System.out.println(premiebedrag / 100 * 0 + premiebedrag);
			break;
		case 2:
			System.out.println(premiebedrag / 100 * 18 + premiebedrag);
			break;
		case 3:
			System.out.println(premiebedrag / 100 * 25 + premiebedrag);
			break;
		case 4:
			System.out.println(premiebedrag / 100 * 33 + premiebedrag);
			break;
		}
		keyboard.close();
		
	}

}
