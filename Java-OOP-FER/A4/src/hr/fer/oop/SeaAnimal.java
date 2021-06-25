package hr.fer.oop;

public abstract class SeaAnimal extends Animal {
	private SeaSpecies type;

	public SeaAnimal(String name, SeaSpecies type) {
		super(name);
		this.type = type;
	}

	public abstract void wayOfMovement();

	public void printSpecies() {
		System.out.println(type);
	}

	public SeaSpecies getType() {
		return type;
	}

	public void setType(SeaSpecies type) {
		this.type = type;
	}

	@Override
	public final void introduceYourself() {
		System.out.println("sea animal");
	}
}
