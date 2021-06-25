package z2;

public class Vector3D extends Triple<Number> {
	public static double dotProduct(Vector3D v1, Vector3D v2) {
		double result=0;
		for(int i=1;i<=3;i++) {
			result+=((Number)v1.getElement(i)).doubleValue()*((Number)v2.getElement(i)).doubleValue();
		}
		return result;
	}
	public Vector3D(Number num1,Number num2,Number num3) {
		super(num1,num2,num3);
	}
	public static void main(String[] args) {
		double x = Vector3D.dotProduct(new Vector3D(-1, 2, 5), new Vector3D(4, -3, 7));
		//x je 25.0 zbog -1 * 4 + 2 * -3 + 5 * 7
		//
		System.out.println(x);
		Triple<Number>  t1 = new Vector3D(-1, 2.3, 5);
	}
}
