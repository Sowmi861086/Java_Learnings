package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class CountCharsInAstringAndPrintBesideThem {
	static int counter = 1;

	public static void main(String[] args) {

		// output should be a3b3c3f4
		String s = "aaabbbcccffffkkkkdddeeeaaaa";
		char[] c = s.toCharArray();
		System.out.println(c);
		Arrays.sort(c);
		System.out.println(c);
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				m.put(c[i], ++counter);
			} else {
				counter = 1;
			}
		}

		System.out.println(m.toString());

	}

}
