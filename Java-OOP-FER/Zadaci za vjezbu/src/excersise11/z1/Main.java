package excersise11.z1;

public class Main {
	public static void main(String[] args) {
		ImmutableContainerA c1 = new ImmutableContainerA(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("C1:");
		for (int i : c1)
			System.out.print(i + " ");
		System.out.println();

		ImmutableContainerB c2 = new ImmutableContainerB(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("C2:");
		for (int i : c2)
			System.out.print(i + " ");
		System.out.println();
		
		ImmutableContainerC c3 = new ImmutableContainerC(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("C3:");
		for (int i : c3)
			System.out.print(i + " ");
		System.out.println();
		
		ImmutableContainerD c4 = new ImmutableContainerD(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("C4:");
		for (int i : c4)
			System.out.print(i + " ");
		System.out.println();
	}
}
