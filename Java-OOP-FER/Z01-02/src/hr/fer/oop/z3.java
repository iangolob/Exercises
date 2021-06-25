package hr.fer.oop;

public class z3 {
	public static void main(String[] args) {
		boolean[] loto=new boolean[39];
		
		for(int i=0;i<7;i++) {
			int nextChosen;
			do {
				nextChosen= (int) (Math.random()*39);
			}while(loto[nextChosen]);
			loto[nextChosen]=true;
		}
		for(int i=0;i<39;i++) {
			if(loto[i]) {
				System.out.printf("%d, ",i+1);
			}
		}
		System.out.println();
	}
}
