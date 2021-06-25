package z1;

import java.util.Collection;
import java.util.*;

public class Ntuple<T extends Comparable<T>> implements Comparable<Ntuple<T>> {
	private List<T> elements;

	public Ntuple(T e1, T e2, T... elements) {
		this.elements = new ArrayList<>();
		this.elements.add(e1);
		this.elements.add(e2);
		for (T e : elements)
			this.elements.add(e);

	}

	public T get(int index) {
		return elements.get(index - 1);
	}

	public void set(int index, T element) {
		elements.set(index - 1, element);
	}

	public int size() {
		return elements.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ntuple other = (Ntuple) obj;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		return true;
	}

	@Override
	public int compareTo(Ntuple<T> o) {
		int poz = 0;
		while (poz < elements.size() && poz < o.elements.size()) {
			if (elements.get(poz).compareTo(o.elements.get(poz)) != 0)
				return elements.get(poz).compareTo(o.elements.get(poz));
			poz++;
		}
		return elements.size() - o.elements.size();
	}

	@Override
	public String toString() {
		String string = "";
		string += "(";
		for (int i = 0; i < elements.size(); i++) {
			if (i != 0)
				string += ", ";
			string += elements.get(i).toString();
		}
		string += ")";
		return string;
	}
}
