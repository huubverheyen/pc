package be.pxl.h5.extraOef4;

import java.util.Scanner;

public class h5extraOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a;
		int b;
		int c;
		int temp;
		
		System.out.println("Geef een getal a in.");
		a = keyboard.nextInt();
		System.out.println("Geef een getal b in.");
		b = keyboard.nextInt();
		System.out.println("Geef een getal c in.");
		c = keyboard.nextInt();
		
		temp = a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println("a:" + a + " b:" + b + " c:" + c);	
		keyboard.close();
	}

}
