package be.pxl.h4.opdr5;

import java.util.Scanner;

public class H4opdr5 {

	public static void main(String[] args) {

		int getal;
		Scanner keyboard = new Scanner(System.in);

		getal = keyboard.nextInt();
		while (getal > 100) {
			System.out.println("Het driedubbele van " + getal + " is " + (getal * 3));
			getal = keyboard.nextInt();
		}
		keyboard.close();
	}

}
