package z2;

import z1.Ntuple;

public class Pair<T extends Comparable<T>> extends Ntuple<T> {

	public Pair(T x, T y) {
		super(x, y);
	}

	public T getX() {
		return super.get(1);
	}

	public T getY() {
		return super.get(2);
	}

	public void setX(T x) {
		super.set(1, x);
	}

	public void setY(T y) {
		super.set(2, y);
	}
}
