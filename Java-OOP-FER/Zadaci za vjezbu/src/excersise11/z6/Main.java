package excersise11.z6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import excersise11.z3.Person;

public class Main {

	public static void main(String[] args) {
	 Map<Integer,String> m1 = convertIterablePersonsToMap(Person.loadPersons());
	// System.out.println(m1);
	 Map<Integer,String> m2 = convertIterableToMap(Person.loadPersons(),
			 (p) -> p.getId(),(p) -> p.getName() );
//	 System.out.println(m2);
	 List<Person> list = Person.loadPersons();
	 list.forEach((p) -> System.out.println(p.getName()+" "+p.getAge()));
	 list.sort((p1,p2) -> p1.getAge()-p2.getAge());
	 System.out.println();
	 //list.removeIf((p) -> p.getAge()<55);
	 //list.forEach((p) -> System.out.println(p.getName()+" "+p.getAge()));
	 m2.forEach((i,s) -> System.out.println(i+" "+s));
	}

	public static Map<Integer, String> convertIterablePersonsToMap(Iterable<? extends Person> persons) {
		Map<Integer, String> map = new HashMap<>();
		for (Person p : persons)
			map.put(p.getId(), p.getName() + " " + p.getSurname());
		return map;
	}

	public static <K, V, E> Map<K, V> convertIterableToMap(Iterable<? extends E> elements, Function<E, K> keyFunction,
			Function<E, V> valueFunction) {
		Map<K, V> map = new HashMap<>();
		for(E elem:elements) {
			K key = keyFunction.apply(elem);
			V value = valueFunction.apply(elem);
			map.put(key, value);
		}
		return map;
	}

}
