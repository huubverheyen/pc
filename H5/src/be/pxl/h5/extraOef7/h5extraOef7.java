package be.pxl.h5.extraOef7;

import java.util.Scanner;

public class h5extraOef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int BTWCode;
		double verkoopprijsInclusiefBTW;
		System.out.println("Wat is de BTWcode?");
		BTWCode = keyboard.nextInt();
		System.out.println("Wat is de verkoopprijs inclusief BTW?");
		verkoopprijsInclusiefBTW = keyboard.nextDouble();
		double BTWpercentage;
		
		if (BTWCode == 1) {
			BTWpercentage = 0.6;
		} else if (BTWCode == 2) {
			BTWpercentage = 0.17;
		} else if (BTWCode == 3) {
			BTWpercentage = 0.19;
		} else if (BTWCode == 4) {
			BTWpercentage = 0.25;
		} else if (BTWCode == 5) {
			BTWpercentage = 0.33;
		} else {
			BTWpercentage = 0.21;
		}
		System.out.println("Het BTWpercentage is: " + BTWpercentage);
		System.out.println("De verkoopprijs exclusief BTW is: " + (verkoopprijsInclusiefBTW - BTWpercentage * verkoopprijsInclusiefBTW));
		System.out.println("Het BTWbedrag is " + (BTWpercentage * verkoopprijsInclusiefBTW));
		keyboard.close();
	}

}
