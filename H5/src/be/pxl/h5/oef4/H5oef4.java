package be.pxl.h5.oef4;

import java.util.Scanner;

public class H5oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een tijd in seconden: ");
		int seconds = keyboard.nextInt();

		int hour = 3600;
		int hours = seconds / hour;
		int minute = 60;
		int rest1 = seconds % hour;
		int minutes = rest1 / minute;
		int seconds1 = rest1 % minute;

		System.out.println(hours + " u()ur(en) " + minutes + " minu(u)t(en) " + seconds1 + "second(en)");

		keyboard.close();
	}

}