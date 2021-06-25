package excersise11.z5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import excersise11.z3.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void printPersons(Iterable<Person> persons, Predicate<Person> criteria,
			Function<Person, String> formatter) {
		for(Person p:persons)
			if(criteria.test(p))
				System.out.println(formatter.apply(p));
	}
	public static void processPersons(Iterable<Person> persons, Predicate<Person> criteria,
			 Consumer<Person> action) {
		for(Person p:persons)
			if(criteria.test(p))
				action.accept(p);
	}
	public static <T, R> void processData(Iterable<T> data, Predicate<T> criteria,
			Function <T, R> mapper, Consumer<R> action) {
		for(T t:data)
			if(criteria.test(t))
				action.accept(mapper.apply(t));
	}


}
