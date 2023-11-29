package StringsPrograms;

public class ConvertCharArrayToString {

	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'c', 'd' };
		String s = new String(ch);

		String s2 = String.valueOf(ch);

		System.out.println(s);
		System.out.println(s2);

	}

}
