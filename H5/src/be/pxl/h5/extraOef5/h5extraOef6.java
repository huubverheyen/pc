package be.pxl.h5.extraOef5;

import java.util.Scanner;

public class h5extraOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int gewichtBrief;
		System.out.println("gewicht van de brief");
		gewichtBrief = keyboard.nextInt();
		double bedrag;
		
		if (gewichtBrief <= 20) {
			bedrag = 0.3;
		} else if (gewichtBrief <= 50) {
			bedrag = 0.5;
		} else if (gewichtBrief <= 150) {
			bedrag = 0.7;
		} else if (gewichtBrief <= 250) {
			bedrag = 1.0;
		} else {
			bedrag = 1.9;
		}
		System.out.println("bedrag: " + bedrag + " euro");
		
		keyboard.close();
	}

}
