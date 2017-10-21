package be.pxl.h5.extraOef2;

import java.util.Scanner;

public class h5extraOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double gradenFahrenheit;
		System.out.println("Geef het aantal  graden Fahrenheit in.");
		gradenFahrenheit = keyboard.nextDouble();
		System.out.println((gradenFahrenheit - 32) * 5 / 9);

	}

}
