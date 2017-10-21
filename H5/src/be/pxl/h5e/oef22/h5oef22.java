package be.pxl.h5e.oef22;

import java.util.Scanner;

public class h5oef22 {

	public static void main(String[] args) {
		
Scanner keyboard = new Scanner(System.in);
		
		int k, aantalPotten;
		double verfNodig, lengte, breedte;
		
		System.out.println("Lengte: ");
		lengte = keyboard.nextInt();
		
		System.out.println("Breedte");
		breedte = keyboard.nextInt();
		
		System.out.println("liter/pot?");
		k = keyboard.nextInt();
		
		verfNodig = HoeveelheidBenodigdeVerf(lengte, breedte);
		aantalPotten = BerekenAantalPottenVerf(verfNodig, k);
		//System.out.println(verfNodig);
		//System.out.println(roundNumber);
		
		System.out.println("De benodigde hoeveelheid verf is: " + verfNodig + " l");
		System.out.println("We hebben " + aantalPotten + " potten verf van " + k + "l nodig.");
		
		
		keyboard.close();
	}
	
	public static int BerekenAantalPottenVerf(double verf, int k) {
		
		int aantalPottenVerf, verfNodigAfgerond;
		double verfNodig;
		
		verfNodig = verf / k;
		verfNodigAfgerond = (int)verfNodig;
		aantalPottenVerf = verfNodigAfgerond;
		
		if (verfNodig > verfNodigAfgerond) {
			aantalPottenVerf++;
		}
		
		return aantalPottenVerf;
	}
	
	public static double HoeveelheidBenodigdeVerf(double lengte, double breedte) {
		double verfNodig;
		
		verfNodig = (lengte * breedte)/7;
		
		return verfNodig;
	}

}
