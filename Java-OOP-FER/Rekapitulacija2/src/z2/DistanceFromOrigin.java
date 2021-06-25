package z2;

import java.util.function.Function;

public class DistanceFromOrigin {
	public static final Function<Pair<? extends Number>, Double> DISTANCE_FROM_ORIGIN = 
			(pair) -> Math.sqrt(Math.pow(pair.getX().doubleValue(),2)+Math.pow(pair.getX().doubleValue(),2));

	public <T extends Number & Comparable<T>> Object apply(Pair<T> point) {
		return DISTANCE_FROM_ORIGIN.apply(point);
	}
}
