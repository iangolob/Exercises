package excersise11.z8;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sequence<T> {
	private List<T> values;

	@SafeVarargs
	public Sequence(T... values) {
		this.values = new LinkedList<>();
		for (T t : values)
			this.values.add(t);
	}

	public Sequence(List<T> values) {
		this.values = values;
	}

	public Sequence<T> filter(Predicate<T> filter) {
		List<T> list = new LinkedList<>();
		for (T t : values)
			if (filter.test(t))
				list.add(t);
		return new Sequence<>(list);
	}

	public <R> Sequence<R> map(Function<? super T, ? extends R> mapper) {
		List<R> list = new LinkedList<>();
		for (T t : values)
			list.add(mapper.apply(t));
		return new Sequence<>(list);
	}

	public void forEach(Consumer<T> action) {
		for (T t : values)
			action.accept(t);
	}

	public List<T> toList() {
		return values;
	}

	public Boolean all(Predicate<T> predicate) {
		boolean result = true;
		for (T t : values)
			result = result && predicate.test(t);
		return result;
	}
}
