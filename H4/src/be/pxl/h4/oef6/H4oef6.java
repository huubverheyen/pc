package be.pxl.h4.oef6;

import java.util.Scanner;

public class H4oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in");
		int getal = keyboard.nextInt();

		for (int count = 1; count <= 20; count++) {
			System.out.println(count + " x " + getal + " = " + count * getal);
		}
		keyboard.close();
	}

}
