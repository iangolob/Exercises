package hr.fer.oop;

public class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void introduceYourself() {
		System.out.println(name);
	}
	

}
