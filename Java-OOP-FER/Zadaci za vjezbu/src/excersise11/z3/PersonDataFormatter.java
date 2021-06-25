package excersise11.z3;

@FunctionalInterface
public interface PersonDataFormatter {
	public String format(Person p);
	default void print(Person p) {
		System.out.println(format(p));
	}
	public static void printAll(Iterable<Person> persons, PersonDataFormatter formatter) {
		for(Person p:persons)
			formatter.print(p);
	}
}
