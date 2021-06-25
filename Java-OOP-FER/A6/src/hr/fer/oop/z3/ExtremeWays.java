package hr.fer.oop.z3;

public class ExtremeWays {
	public static void method1() throws TomahawkException {
		method2();
		method4();
	}

	public static void method2() throws TomahawkException {
		try {
			method3();
		} catch (ArithmeticException exc) {
			System.out.println(exc.getMessage());
		}
	}

	public static void method3() throws TomahawkException {
		throw new TomahawkException("This is a tomahawk exception");
	}

	public static void method4() {
		throw new UpException("This is an up exception");
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (TomahawkException | UpException exc) {
			System.out.println(exc.getMessage());
		}
	}

}
