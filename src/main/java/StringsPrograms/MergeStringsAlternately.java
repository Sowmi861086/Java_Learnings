package StringsPrograms;

public class MergeStringsAlternately {
	static String answer = "";

	public static void main(String[] args) {

		String word1 = "abc";
		String word2 = "pqrstuv";

		int i = 0;
		while (i < word1.length() && i < word2.length()) {

			answer = answer + word1.charAt(i);
			answer = answer + word2.charAt(i);
			i++;

		}
		while (i < word1.length()) {
			answer += word1.charAt(i);
			i++;
		}
		while (i < word2.length()) {
			answer += word2.charAt(i);
			i++;
		}
		System.out.println(answer);

	}

}
