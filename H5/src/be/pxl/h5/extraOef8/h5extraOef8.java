package be.pxl.h5.extraOef8;

import java.util.Arrays;
import java.util.Scanner;

public class h5extraOef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int grootteLijst = 3;
		double[] lijst = new double [grootteLijst];
		double getal;
		for (int n = 0; n < grootteLijst; n++) {
			System.out.println("Geef getal in:");
			getal = keyboard.nextDouble();
			lijst[n] = getal;
		} Arrays.sort(lijst);
		System.out.println(lijst[0] + " " + lijst[1] + " " + lijst[2]);
		keyboard.close();
		
	}

}
