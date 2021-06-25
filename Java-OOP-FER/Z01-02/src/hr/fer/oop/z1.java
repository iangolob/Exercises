package hr.fer.oop;

public class z1 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			System.out.printf("Pi after %7d sum elements: %.15f%n",(int)Math.pow(10, i),genPi((int)Math.pow(10, i)));
		}

	}
	public static double genPi(int sumNum) {
		double pi = 0;
		for(int i =0;i<sumNum;i++) {
			pi+=Math.pow(-1, i)/(2*i+1);
		}
		return pi*4;
	}
	


}
