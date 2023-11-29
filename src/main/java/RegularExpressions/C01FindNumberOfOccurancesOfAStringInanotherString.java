package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C01FindNumberOfOccurancesOfAStringInanotherString {
	public static void main(String[] args) {
		
		String s="abaaabbbbbab";
		int count=0;
		
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher(s);
		
		while(m.find()) {
			count++;
			System.out.println(m.start());
			/*
			 * System.out.println("------------------------------");
			 * System.out.println(m.end());
			 * System.out.println("------------------------------");
			 * System.out.println(m.group());
			 */
		}
		System.out.println(count);
	}

}
