package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C02CheckIfRequiredCharactersAreOnlyPresent {
	public static void main(String[] args) {
		
		String s="abaaabbbbbab356";
		
		//s.matches("[0-9][a-z][A-Z]");
		
		System.out.println(s.matches("[0-9][a-z][A-Z]"));
		
		
		
	}
		

}
