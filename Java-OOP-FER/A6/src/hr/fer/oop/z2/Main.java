package hr.fer.oop.z2;

public class Main {

	public static void main(String[] args) {
		try {
			Bankar.pohlepnoGrabljenje();
		}
		catch(Exception exc) {
			System.out.println(exc.getMessage());
		}
	}

}
