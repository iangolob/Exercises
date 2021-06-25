package hr.fer.oop;

public class Octopus extends SeaAnimal {

	public Octopus(String name, SeaSpecies type) {
		super(name,type);
	}
	
	
	
	
	@Override
	public void wayOfMovement() {
		System.out.println("octopus walking");

	}

}
