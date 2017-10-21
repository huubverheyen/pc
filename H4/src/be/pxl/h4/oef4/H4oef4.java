package be.pxl.h4.oef4;

import java.util.Calendar;
import java.util.Scanner;

public class H4oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Van welk jaar is de film?");
		int jaartal = keyboard.nextInt();

		System.out.println("Wat is de rating van de film? (1-5) ");
		int rating = keyboard.nextInt();

		int basisprijs = 5;
		int jaar = Calendar.getInstance().get(Calendar.YEAR);

		jaar = jaar - jaartal;

		if (jaar < 2) {
			basisprijs = basisprijs + 1;
		}
		if (rating > 4) {
			basisprijs = basisprijs + 2;
		} else
				if (rating > 2) {
					basisprijs = basisprijs + 1;
		}
		if (basisprijs > 7) {
			basisprijs = 7;
		}
		System.out.println("De prijs is" + basisprijs + " euro");
		keyboard.close();
	}

}
