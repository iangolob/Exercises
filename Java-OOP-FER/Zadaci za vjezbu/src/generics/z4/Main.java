package generics.z4;

public class Main {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(5);
		int i2=i1.intValue();
		System.out.println(i1+" "+i2);
		
		Integer i3=5;
		int i4=i3;
		System.out.println(i3+" "+i4);
		
		Integer i5=null;
		int i6=i5;
		System.out.println(i5+" "+i6);
		
	}

}
