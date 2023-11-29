package StringsPrograms;

import java.util.Arrays;

public class C04StringAnagramProgram_GeeksForGeeks {
	public static void main(String[] args) {

		String s1 = "Mother in law";
		String s2 = "Hitler woman";

		String s = s1.toLowerCase().replace(" ", "");
		String ss = s2.toLowerCase().replace(" ", "");
		
		char[] s1Array = s.toLowerCase().toCharArray();
        char[] s2Array = ss.toLowerCase().toCharArray();

		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		System.out.println(Arrays.equals(s1Array, s2Array));

	}
}