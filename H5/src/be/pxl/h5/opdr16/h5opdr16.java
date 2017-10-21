package be.pxl.h5.opdr16;

import java.util.Scanner;

public class h5opdr16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in");
		int getal = keyboard.nextInt();
		toonTafel(getal);
		keyboard.close();
	}
	
	public static void toonTafel(int getal) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + getal + " = " + (getal * i));
			
		
		}
	
	}

}
