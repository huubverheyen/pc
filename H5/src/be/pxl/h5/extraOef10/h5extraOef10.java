package be.pxl.h5.extraOef10;

import java.util.Scanner;

public class h5extraOef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int jaar;
		System.out.println("Geef een jaartal in");
		jaar = keyboard.nextInt();

		if (jaar % 4 == 0 && jaar % 100 == 0) {
			if (jaar % 400 == 0) {
				System.out.println("Het jaar " + jaar + " is een schrikkeljaar");
			} else {
			System.out.println("Het jaar " + jaar + " is geen schrikkeljaar");
			}
		} else {
			System.out.println("Het jaar " + jaar + " is geen schrikkeljaar");
		}
		keyboard.close();
	}

}
