package be.pxl.h5.extraoef1;

import java.util.Scanner;

public class h5extraOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double gradenCelcius;
		System.out.println("Geef het aantal graden celcius.");
		gradenCelcius = keyboard.nextDouble();
		
		System.out.println((9 * gradenCelcius)/5 + 32);
	}

}
