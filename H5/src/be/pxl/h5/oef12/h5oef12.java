package be.pxl.h5.oef12;

import java.util.Scanner;

public class h5oef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int maanGewicht; 
		int jupiterGewicht; 
		int marsGewicht;
		double maan;
		double jupiter;
		double mars;
		
		System.out.println("Wat is je percentage van je gewicht t.o.v. de aarde?");
		maan = (keyboard.nextDouble() / 100);
		System.out.println("Wat is je percentage van je gewicht t.o.v. jupiter?");
		jupiter = (keyboard.nextDouble() / 100);
		System.out.println("Wat is je percentage van je gewicht t.o.v. mars?");
		mars = (keyboard.nextDouble() / 100);
		
		System.out.println("aarde \t jupiter \t maan \t");
		for (int i= 50; i <121; i++) {
			maanGewicht = (int) (maan * i);
			jupiterGewicht = (int) (jupiter * i);
			marsGewicht = (int) (mars * i);		
			System.out.println(i + "\t" + maanGewicht +  "\t" + jupiterGewicht + "\t" + marsGewicht);
		}
		keyboard.close();
	}

}
