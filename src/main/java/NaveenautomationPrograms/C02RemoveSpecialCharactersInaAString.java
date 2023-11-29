package NaveenautomationPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C02RemoveSpecialCharactersInaAString {
	
	public static void main(String[] args) {
		String s="sgdflk%&%^& *(***lkjdfkhrig";
		
		Pattern p=Pattern.compile("[a-zA-Z]");
		Matcher m=p.matcher(s);
		while(m.find()) {
		System.out.print(m.group());
		}
		
	}

}
