package be.pxl.h4.extraoef1;

import java.util.Scanner;

public class h4extraOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in");
		int getal1 = keyboard.nextInt();

		System.out.println("Geef een tweede getal in");
		int getal2 = keyboard.nextInt();

		int kleinsteGetal;
		
		if (getal1 < getal2) {
			kleinsteGetal = getal1;
		} else {
			kleinsteGetal = getal2;
		}
			
			System.out.println("Het kleinste getal is " + kleinsteGetal);
			System.out.println("Het kwadraat van het kleinste getal is " + kleinsteGetal * kleinsteGetal);
		
		keyboard.close();
	}

}
