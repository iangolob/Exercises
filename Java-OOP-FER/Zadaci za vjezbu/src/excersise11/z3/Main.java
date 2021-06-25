package excersise11.z3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		print1(Person.loadPersons());
		print2(Person.loadPersons());
		print3(Person.loadPersons());
		
	}

	public static void print1(List<Person> persons) {
		PersonDataFormatter format1 = new PersonDataFormatter() {
			@Override
			public String format(Person p) {
				return String.format("%s %s %s %s %d%n", p.getName(), p.getSurname(), p.getBirthday().toString(),
						p.getGender(), p.getAge());
			}
		};
		PersonDataFormatter.printAll(persons, format1);
	}

	public static void print2(List<Person> persons) {
		PersonDataFormatter.printAll(persons, (person) -> String.format("%s %s %d%n", person.getName(),
				person.getSurname().toUpperCase(), person.getAge()));
	}

	public static void print3(List<Person> persons) {
		for (Person p : persons) {
			if (p.getAge() < 55)
				System.out.format("%s %s %d%n", p.getName(), p.getGender(), p.getAge());
		}
	}
}
