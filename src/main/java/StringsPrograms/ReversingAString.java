package StringsPrograms;

import java.util.Iterator;

public class ReversingAString {
	public static void main(String[] args) {
		
		/**
		 * Method 1 with StringBuffer
		 */
		StringBuffer s=new StringBuffer("Sowdamini");
		System.out.println(s.reverse());
		
		/**
		 * Method2
		 */
		String s1="Sowdamini";
		char[] ch=s1.toCharArray();
		for(int i=ch.length-1; i>=0;i--) {
			System.out.println(ch[i]);
			
		}
	}

}
