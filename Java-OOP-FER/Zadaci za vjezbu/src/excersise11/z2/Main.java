package excersise11.z2;

public class Main {

	public static void main(String[] args) {
		Airplane CA = new Airplane("Croatia Airlines");
		Airplane.Captain Sully = CA.new Captain("Sully");
		CA.addCargo(new Airplane.Cargo("mail", 50));
		CA.addCargo(new Airplane.Cargo("luggage", 500));
		Sully.sayWelcomeAndPilot("Rijeka", "Venice");
	}

}
