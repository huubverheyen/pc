package be.pxl.h5.oef2;

import java.util.Scanner;


public class h5oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hoeveel artikelen wilt u kopen? ");
		int aantal = keyboard.nextInt();
		double eenheidsprijsArtikel = 11.5;
		int btwPercentage = 21;
		double totaal = eenheidsprijsArtikel * aantal;
		double btwApart = (totaal * btwPercentage) / 100;
		System.out.println("Het totaalbedrag exclusief btw is " + totaal + " euro");
		System.out.println("Het btwbedrag is " + btwApart + " euro");
		System.out.println("Het totaalbedrag inclusief btw is " + (totaal + btwApart) + " euro");
		
		keyboard.close();
	}

}
