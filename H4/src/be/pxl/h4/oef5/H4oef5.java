package be.pxl.h4.oef5;

import java.util.Scanner;

public class H4oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef het gewicht van de appel");
		int gewichtAppel = keyboard.nextInt();

		for (int count = 1; count <= 100; count++) {
			System.out.println(count + " " + (count * gewichtAppel));
		}
		System.out.println("Geef het gewicht van de appel");
		gewichtAppel = keyboard.nextInt();
		int count = 1;
		while (count <= 100) {
			System.out.println(count + " " + count * gewichtAppel);
			count++;
		}
		keyboard.close();
	}

}
