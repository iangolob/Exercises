package collections2;

import java.util.*;

public class Loader {

	public static List<Person> loadPerson() {
		List<Person> persons = Arrays.asList(new Person("QWE10975", "Ivan", "Horvat", 25, "Student"),
				new Person("ASD11796", "Petra", "Pavloviæ", 17, "Uèenik"),
				new Person("YXC86327", "Sven", "Grgiæ", 67, "Umirovljenik"),
				new Person("GHJ08548", "Jasna", "Brkiæ", 20, "Student"));
		return persons;
	}

	public static List<Bicycle> loadBicycle() {
		List<Person> persons = Loader.loadPerson();
		List<Bicycle> bicycles = Arrays.asList(new Bicycle("Pinarello", 1050, persons.get(0)),
				new Bicycle("Scott", 1200, persons.get(1)), new Bicycle("Rog", 1750, persons.get(2)),
				new Bicycle("Merida", 950, persons.get(3)));
		return bicycles;
	}
}