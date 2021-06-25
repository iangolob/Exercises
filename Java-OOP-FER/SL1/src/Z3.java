
public class Z3 {
	public static String stringFloss(String[] elements) {
		
		//find max string length
		int max_length=0;
		for(int i=0;i<elements.length;i++) {
			if(elements[i].length()>max_length) {
				max_length=elements[i].length();
			}
		}
		
		//generate result
		String rez="";
		for(int i=0;i<max_length;i++) {
			for(int j=0;j<elements.length;j++) {
				if(elements[j].length()>=i+1) {
					rez=rez+elements[j].charAt(i);
				}
			}
		}
		return rez;
	}
	public static void main(String[] args) {
		System.out.println(stringFloss(args));
	}
}
