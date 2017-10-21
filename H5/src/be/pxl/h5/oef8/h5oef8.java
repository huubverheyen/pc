package be.pxl.h5.oef8;

import java.util.Scanner;

public class h5oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef de 3 resultaten die je op 20 hebt gehaald");
		double restultaat1 = keyboard.nextDouble();
		double restultaat2 = keyboard.nextDouble();
		double restultaat3 = keyboard.nextDouble();

		double percentage = (restultaat1 + restultaat2 + restultaat3) / 60 * 100;

		if (percentage < 60) {
			System.out.println(percentage + " is onvoldoende");
		} else {
			if (percentage < 70) {
				System.out.println(percentage + " is voldoende");
			} else {
				if (percentage < 80) {
					System.out.println(percentage + " is onderscheding");
				} else {
					if (percentage < 90) {
						System.out.println(percentage + " is grote onderscheiding");
					} else {
						System.out.println(percentage + " is grootste onderscheiding");
					}
				}

			}
		}

		keyboard.close();
	}

}
