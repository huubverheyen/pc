package be.pxl.h5.oef5;

import java.util.Scanner;

public class h5oef5 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		
		int bedrag;
		int aantalBriefjesVan20;
		int restBedrag;
		
		System.out.println("Geef een (geheel) bedrag in: ");
		bedrag = keyboard.nextInt();
		
		aantalBriefjesVan20 = bedrag / 20;
		restBedrag = bedrag % 20;
		
		System.out.println("Met een bedrag van " + bedrag + " euro, kan je " + aantalBriefjesVan20 + " briefje(s) van 20 euro maken en heb je " + restBedrag + " euro over.");
		keyboard.close();
	}

}
