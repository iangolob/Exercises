package hr.fer.oop;

public class Lion extends Animal implements MakeSound{

	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void introduceYourself() {
		System.out.println("lion "+this.getName());
	}
	public void makeSound() {
		System.out.println("vau vau");
	}
}
