package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een bedrag in in BEF");
		final double BEF = 40.3399;
		double bedrag = keyboard.nextDouble();
		
		double euro = bedrag / BEF;
		
		System.out.println(euro + " euro");
		
		keyboard.close();
	}

}
