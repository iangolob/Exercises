package hr.fer.oop.z2;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 4);
		Fraction f2 = new Fraction(2, 3);

		Fraction f = f1.add(f2);
		System.out.println(f);//ispisuje: 11 / 12

		f = f1.subtract(f2);
		System.out.println(f);//ispisuje: -5 / 12

		System.out.println(f2.invert().negate()); // -3/2
		f = f1.multiply(f2);
		System.out.println(f);//ispisuje: 1 / 6
		f = f1.divide(f2);
		System.out.println(f);//ispisuje: 3 / 8
	}

}
