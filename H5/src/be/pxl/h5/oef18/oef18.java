package be.pxl.h5.oef18;

import java.util.Scanner;

public class oef18 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int getal, faculteit;

		System.out.println("Geef een getal in:");
		getal = keyboard.nextInt();

		while (getal != 0) {
			faculteit = 1;
			for (; getal > 1; getal--) {
				faculteit = faculteit * getal;
			}
			System.out.println("De faculteit is " + faculteit + ".");
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
		}

		keyboard.close();	

	}

}
