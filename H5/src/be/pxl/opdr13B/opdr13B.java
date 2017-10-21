package be.pxl.opdr13B;

import java.util.Scanner;

public class opdr13B {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in tussen 0 en 10");
		int getal = keyboard.nextInt();
		while (getal <= 0 || getal >= 10) {
			System.out.println("Geef een getal tussen 0 en 10");
			getal = keyboard.nextInt();
		}
		keyboard.close();
	}

}
