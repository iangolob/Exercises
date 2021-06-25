
public class Z2 {

	public static int brojSamoglasnika(String str) {
		int rez=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				rez++;
				break;
			}
		}
		return rez;
	}
	public static void main(String[] args) {
		System.out.println(brojSamoglasnika("Onomatopeja"));

	}

}
