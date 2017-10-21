package be.pxl.h5.opdr16B;

import java.util.Scanner;

public class h5opdr16B {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een belastbaar bedrag in");
		double belastbaarBedrag = keyboard.nextDouble();
		verschuldigdeBelasting (belastbaarBedrag);
		System.out.println("De verschuldigde belasting is " + verschuldigdeBelasting(belastbaarBedrag));
		keyboard.close();
	}
	
	public static double verschuldigdeBelasting (double belastbaarBedrag) {
		double belasting = 0;
		if (belastbaarBedrag <= 25000) {
			belasting = belastbaarBedrag * 0.384;
		} else {
			if (belastbaarBedrag <= 55000) {
				belasting = (belastbaarBedrag -25000) * 0.5 + 25000 * 0.384;
			} else {
				belasting = (belastbaarBedrag - 55000) * 0.6 + 30000 * 0.5 + 25000 * 0.384;
			}
		}
		return belasting;

	}

}
