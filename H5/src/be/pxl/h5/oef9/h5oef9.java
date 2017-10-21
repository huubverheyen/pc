package be.pxl.h5.oef9;

import java.util.Scanner;

public class h5oef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal A in");
		int getalA = keyboard.nextInt();
		System.out.println("Geef een betal B in");
		int getalB = keyboard.nextInt();
		System.out.println("Geef een getal van 1-5");
		int getalC = keyboard.nextInt();
		switch (getalC) {
		case 1:
			System.out.println(getalA + " + " + getalB + " = " + (getalA + getalB));
			break;
		case 2:
			System.out.println(getalA + " - " + getalB + " = " + (getalA - getalB));
			break;
		case 3: 
			System.out.println(getalA + " x " + getalB + " = " + (getalA * getalB));
			break;
		case 4:
			System.out.println(getalA + " x " + getalA + " = " + (getalA * getalA));
			break;
		case 5:
			System.out.println(getalB + " x " + getalB + " = " + (getalB * getalB));
			break;
		default:
			System.out.println("Foutive code");
		}
		keyboard.close();
	}

}
