package hr.fer.oop;

public class Duck extends Animal implements MakeSound{

	public Duck(String name) {
		super(name);
	}
	@Override
	public void introduceYourself() {
		System.out.println("duck "+this.getName());
	}
	public void makeSound() {
		System.out.println("kva kva");
	}
}
