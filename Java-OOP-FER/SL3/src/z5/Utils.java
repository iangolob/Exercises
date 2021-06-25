package z5;

public class Utils {
	public static int checkPassword(String password) {
		if(password.length()<6) throw new IllegalArgumentException();
		
		int length = password.length();
		int numOfDigits = 0;
		int numOfUpperCaseLetters = 0;

		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i)))
				numOfUpperCaseLetters++;
			if (Character.isDigit(password.charAt(i)))
				numOfDigits++;
		}
		int grade=length + numOfDigits * 3 + numOfUpperCaseLetters * 2;
		
		if(grade<10) throw new SecurityException();
		return grade;
	}
}
