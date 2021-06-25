package hr.fer.oop.z1;


public class Prodavac {
	public static void zabiljezi(String zapis) {
		try {
			double total,returned,amount;
			String[] elements= zapis.split(",");

			total=Double.parseDouble(elements[0]);
			returned=Double.parseDouble(elements[1]);
			amount=Double.parseDouble(elements[2]);
			System.out.println(String.format("Cijena po proizvodu: %f",(total-returned)/amount));
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Not enough arguments given");
		}
		catch(NullPointerException exc) {
			System.out.println("Null given as argument");
		}
		catch(IllegalArgumentException exc) {
			System.out.println("Illegal arguments given");
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
}
