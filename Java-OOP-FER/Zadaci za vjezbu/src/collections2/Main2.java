package collections2;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		List<Person> persons = Loader.loadPerson();
		List<Bicycle> bicycles = Loader.loadBicycle();
		Set<Person> personSet = new TreeSet<>();
		Collections.addAll(personSet,persons);
		System.out.println(persons);
	}
}
