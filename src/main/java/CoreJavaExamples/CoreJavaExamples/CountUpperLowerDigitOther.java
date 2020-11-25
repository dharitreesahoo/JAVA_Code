package CoreJavaExamples.CoreJavaExamples;

public class CountUpperLowerDigitOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit = 0;
		int UpperCase = 0;
		int c = 0;
		int other = 0;

		String str = "Dharitre sahoo$$%%^^&G";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				UpperCase++;
			}

			if (Character.isDigit((ch))) {
				digit++;
			}

			else {
				other++;
			}
		}
		System.out.println(UpperCase);
		System.out.println(digit);
		System.out.println(digit);
	}

}
