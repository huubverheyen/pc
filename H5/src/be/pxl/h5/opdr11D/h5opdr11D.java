package be.pxl.h5.opdr11D;

import java.util.Scanner;

public class h5opdr11D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Wat is je lengte?");
		double lengte = input.nextDouble();
		System.out.println("Wat is je gewicht in kilo?");
		double gewicht = input.nextDouble();
		
		double BMI = gewicht / (lengte * lengte);
		
		if (BMI <= 18) {
			System.out.println("ondergewicht!");
		} else {
			if (BMI <= 25) {
				System.out.println("OK");
			} else {
				if (BMI <= 30) {
					System.out.println("overgewicht!");
				} else {
					if (BMI < 40) {
						System.out.println("obisitas");
					} else {
						System.out.println("ziekelijk overgewicht");
					}
				}
			}
		}
		
		input.close();
	}

}
