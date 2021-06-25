
public class Z4 {
	static boolean common_digit(int twoDigitNum1, int twoDigitNum2) {
		boolean result=false;
		if(twoDigitNum1>=10 && twoDigitNum1<=99 && twoDigitNum2>=10 && twoDigitNum2<=99) {
			int[] Num1Digits = {twoDigitNum1/10,twoDigitNum1%10};
			int[] Num2Digits = {twoDigitNum2/10,twoDigitNum2%10};
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					if(Num1Digits[i]==Num2Digits[j]) {
						result=true;
					}
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(common_digit(12,13));
		System.out.println(common_digit(22,22));
		System.out.println(common_digit(12,34));
	}

}
