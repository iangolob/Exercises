package hr.fer.oop;

import hr.fer.oop.SeaSpecies;

public class Main {

	public static void main(String[] args) {
		Lion l = new Lion("mutavi lav");
		Duck d = new Duck("mutava patka");
		Animal a = new Animal("mutava zivotinja");
		((Animal) l).introduceYourself();
		d.introduceYourself();
		a.introduceYourself();
		l.makeSound();
		d.makeSound();
		SeaSpecies s = SeaSpecies.CRUSTACEAN;
		System.out.println(s);
	}

}
