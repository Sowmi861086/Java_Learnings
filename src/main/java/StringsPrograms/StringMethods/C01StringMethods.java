package StringsPrograms.StringMethods;

public class C01StringMethods {
	public static void main(String[] args) {
		String s = "abc this is my sentence";

		/**
		 * CharAt method
		 */
		char c = s.charAt(5);
		System.out.println("charAt() " + c);

		/**
		 * codePointAt
		 * The codepoint method return the ascii value of the character at particular index
		 */
		int i = s.codePointAt(0);
		System.out.println("codepointAt() " + i);

		/**
		 * codepointBefore 
		 * 
		 */
		int i1 = s.codePointBefore(1);
		System.out.println(
				"codePointBefore() " + i1);

		/**
		 * CodePointCount : did not understand
		 */
		int i2 = s.codePointCount(0, 2);
		System.out.println("codePoinCount() "+i2);

		String s2 = "abc ";
		int i3 = s.compareTo(s2);
		System.out.println("CompareTo() "+i3);
		
		int i4=s.compareToIgnoreCase(s2);
		System.out.println("compareToIgnoreCase() "+i4);
		
		
		/**
		 * Concat()
		 */
		String con=s.concat(s2);
		System.out.println("concat() "+con);
		
		
		boolean b=s.contains(s2);
		System.out.println("contains() "+b);
		
		
		s.contentEquals(s2);

	}

}
