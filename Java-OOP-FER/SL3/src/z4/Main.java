package z4;

public class Main {

	public static void main(String[] args) {
		XY[] data1 = new XY[5];
		data1[0] = new XY(6.,8.);
		data1[1] = new XY(7.,8.);
		data1[2] = new XY(9.1,13.);
		data1[3] = new XY(-3.,-2.);
		data1[4] = new XY(-1.,4.);
		System.out.println(XY.isIncreasingFunction(data1));
		XY[] data2 = new XY[5];
		data2[0] = new XY(6,8);
		data2[1] = new XY(7.5,12);
		data2[2] = new XY(9,9);
		data2[3] = new XY(10,10);
		data2[4] = new XY(11,11);
		System.out.println(XY.isIncreasingFunction(data2));
	}

}
