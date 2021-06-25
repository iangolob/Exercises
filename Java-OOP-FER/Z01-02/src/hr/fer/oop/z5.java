package hr.fer.oop;

public class z5 {
	
	public static void main(String[] args) {
	
		if(args.length!=3) {
		
			System.out.println("Program needs arguments for a, b and c in ax^2 + bx = c");
		
		}else {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			double discriminant =Math.pow(b, 2)-4*a*c;
			if(discriminant<0) {
				System.out.println("No solution available in R");
			}else {
				System.out.printf("Solutions: %f , %f",(-b-Math.sqrt(discriminant))/(2*a),(-b+Math.sqrt(discriminant))/(2*a));
			}
			
			
		}
		
	}
}
