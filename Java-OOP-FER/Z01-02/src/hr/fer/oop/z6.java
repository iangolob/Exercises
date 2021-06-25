package hr.fer.oop;

import java.util.Scanner;

public class z6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double discriminant =Math.pow(b, 2)-4*a*c;
		if(discriminant<0) {
			System.out.println("No solution available in R");
		}else {
			System.out.printf("Solutions: %f , %f",(-b-Math.sqrt(discriminant))/(2*a),(-b+Math.sqrt(discriminant))/(2*a));
		}
			
			
		
		
	}
}
