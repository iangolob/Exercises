package z4;

public class XY extends SingleTypeKeyValue<Double> {
	public XY(double x, double y) {
		super(x, y);
	}
	public static boolean isIncreasingFunction(XY[] data) {
		if (data.length <= 1)
			return true;

		double lastX = data[0].getKey();
		double lastY = data[0].getValue();
		for (XY xy : data) {
			if (xy.getKey() < lastX) {
				lastX = xy.getKey();
				lastY = xy.getValue();
			}
		}

		double nextX=lastX;
		double nextY=lastY;
		do {
			lastX=nextX;
			lastY=nextY;
			for (XY xy : data) {
				if (xy.getKey() > lastX) {
					if (lastX == nextX) {
						nextX = xy.getKey();
						nextY = xy.getValue();
					} else {
						if (xy.getKey() < nextX) {
							nextX = xy.getKey();
							nextY = xy.getValue();
						}
					}
				}
			}
			if (nextY < lastY)
				return false;
			

		} while (nextX != lastX);
		return true;
	}
}
