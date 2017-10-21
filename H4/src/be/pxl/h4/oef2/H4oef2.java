package be.pxl.h4.oef2;

import java.util.Scanner;

public class H4oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal in ");
		int getal1 = keyboard.nextInt();

		System.out.println("Geef een tweede getal in ");
		int getal2 = keyboard.nextInt();

	
		if (getal1 < getal2) {
			int temp = getal2;
			getal2 = getal1;
			getal1 = temp;
		}
		System.out.println(getal1 + " - " + getal2 + " = " + (getal1 - getal2));
		System.out.println((getal1 - getal2) + " x 5 " + " = " + (getal1 - getal2) * 5);
		keyboard.close();
	}

}
