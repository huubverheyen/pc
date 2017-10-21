package be.pxl.h4.extraoef2;

import java.util.Scanner;

public class H4extraOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in");
		int getal1 = keyboard.nextInt();
				
		System.out.println("Geef een tweede getal in");
		int getal2 = keyboard.nextInt();
		
		if (getal1 + getal2 < 20) {
			System.out.println("Geef een derde getal in");
			int getal3 = keyboard.nextInt();
			
			int uitkomst = (getal1 + getal2 + getal3);
			System.out.println("De uitkomst is " + uitkomst);
		} else {
			System.out.println("Te groot");
			
		} keyboard.close();

	}

}
