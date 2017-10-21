package be.pxl.h5.extraoef6;

import java.util.Scanner;

public class h5extraOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef het gewicht in (gram)");
		int gewicht = keyboard.nextInt();

		if (gewicht <= 20) {
			System.out.println(" 0.3 euro");
		} else {
			if (gewicht <= 50) {
				System.out.println("0.5 euro");
			} else {
				if (gewicht <= 150) {
					System.out.println("0.7 euro");
				} else {
					if (gewicht <= 250) {
						System.out.println("1.0 euro");
					} else {
						System.out.println("1.9 euro");
					}

				}
			}
		}

		keyboard.close();

	}

}
