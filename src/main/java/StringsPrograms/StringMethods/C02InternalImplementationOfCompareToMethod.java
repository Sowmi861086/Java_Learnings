package StringsPrograms.StringMethods;

public class C02InternalImplementationOfCompareToMethod {
	public static void main(String[] args) {

		String s1 = "python";
		String s2 = "pjava";
		int x=compare(s1, s2);
		System.out.println(x);
	}

	static int compare(String s1, String s2) {

		int length1 = s1.length();
		int length2 = s2.length();

		int min = Math.min(length1, length2);
		System.out.println(min);

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		for (int i = 0; i < min; i++) {
			char c1 = ch1[i];
			char c2 = ch2[i];
			if (c1 != c2) {
				return c1 - c2;
			}
		}

		return length1 - length2;

	}
}
