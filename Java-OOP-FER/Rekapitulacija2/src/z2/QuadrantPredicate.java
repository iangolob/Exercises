package z2;

import java.util.function.Predicate;

public class QuadrantPredicate<T extends Number & Comparable<T>> implements Predicate<Point> {
	private boolean firstQ;
	private boolean secondQ;
	private boolean thirdQ;
	private boolean fourthQ;
	
	
	@Override
	public boolean test(Point t) {
		if(firstQ && t.getX().doubleValue()>0 && t.getY().doubleValue()>0)
			return true;
		if(secondQ && t.getX().doubleValue()<0 && t.getY().doubleValue()>0)
			return true;
		if(thirdQ && t.getX().doubleValue()<0 && t.getY().doubleValue()<0)
			return true;
		if(fourthQ && t.getX().doubleValue()>0 && t.getY().doubleValue()<0)
			return true;
		return false;
	}


	public QuadrantPredicate(boolean firstQ, boolean secondQ, boolean thirdQ, boolean fourthQ) {
		super();
		this.firstQ = firstQ;
		this.secondQ = secondQ;
		this.thirdQ = thirdQ;
		this.fourthQ = fourthQ;
	}

}
