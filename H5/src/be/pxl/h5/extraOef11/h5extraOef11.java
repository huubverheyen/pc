package be.pxl.h5.extraOef11;

public class h5extraOef11 {

	public static void main(String[] args) {
		double gradenCelcius;
		double Fahrenheit;
		
		System.out.println(" graden celcius \t graden fahrenheit");
		
		for (gradenCelcius = -40; gradenCelcius <= 100; gradenCelcius += 10) {
			Fahrenheit = ((((double) 9 / 5) * gradenCelcius) +32);
			System.out.println("\t" + (int) gradenCelcius + "\t\t" + (int) Fahrenheit);
		
		}

	}

}
