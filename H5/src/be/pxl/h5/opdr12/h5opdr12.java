package be.pxl.h5.opdr12;

import java.util.Scanner;


public class h5opdr12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een nummer in");
		int nummer = keyboard.nextInt();
		switch (nummer) {
		case 1: 
			System.out.println("Het getal is 1");
			break;
		case 2: 
			
		case 3:	
			System.out.println("Het getal is 2 of 3");
			break;
		default:
			System.out.println("Het getal is niet 1,2 of 3");
		}
		keyboard.close();
	}

}
