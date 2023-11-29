package StringsPrograms;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethod1_8 {
	public static void main(String[] args) {
		
		/**
		 * Example 1
		 */
		String finalString= String.join(" --> ", "Wake up","Eat","Sleep");
		System.out.println(finalString);
		
		/**
		 * Example 2
		 */
		List<String> list=Arrays.asList("Mon","tue","wed");
		String finalString2=String.join("@@@", list);
		System.out.println(finalString2);
		
	}

}
