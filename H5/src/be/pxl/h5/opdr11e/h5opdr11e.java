package be.pxl.h5.opdr11e;

import java.util.Scanner;

public class h5opdr11e {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Wat is uw burgelijke staat");
		System.out.println("1 = ongehuwd");
		System.out.println("2 = gehuwd");
		System.out.println("3 = weduwe(naar)");
		int staat = input.nextInt();
		System.out.println("Wat is uw leeftijd");
		int leeftijd = input.nextInt();
		//A
//		if (staat == 1) {
//			lidgeld = 25;
//		} else {
//			if (staat == 2) {
//				lidgeld = 20;
//			} else {
//				lidgeld = 15;
//			}
//		System.out.println("lidgeld bedraagt " + lidgeld);
//		}
		//B
//		if (staat == 1 && leeftijd < 30) {
//			System.out.println("25 euro betalen");
//		} else {
//			System.out.println("15 euro betalen");
//		}
		//C
//		if (staat == 1 || leeftijd < 30) {
//			System.out.println("25 euro betalen");
//		} else {
//			System.out.println("15 euro betalen");
//		}
		//D
		
	}

}
