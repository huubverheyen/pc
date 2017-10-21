package be.pxl.h5.extraOef3;

import java.util.Scanner;

public class h5extraOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double lengte;
		double breedte;
		double diepte;
		
		System.out.println("Wat is de lengte van het zwembad in meter?");
		lengte = keyboard.nextDouble();
		System.out.println("Wat is de breedte van het zwembad in meter?");
		breedte = keyboard.nextDouble();
		System.out.println("Wat is de diepte van het zwembad in meter?");
		diepte = keyboard.nextDouble();
		
		double water = (lengte * breedte * diepte) * 0.98;
		double ontsmettingsmiddel = (lengte * breedte * diepte) * 0.02;
		
		System.out.println("Aantal liter water: " + (int)water);
		System.out.println("Aantal liter ontmettingsmiddel " + (int)ontsmettingsmiddel);
		
		keyboard.close();
	}

}
