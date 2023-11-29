package programs.leetcode;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 * 
 * @author Sowdamini.Ampolu
 *
 */

public class C01RepetedSubstringPattern {
	static boolean b = false;

	public static void main(String[] args) {
		
		   String str = "ababab";
	        String tempStr = null;
	        for (int i = 1; i <= str.length(); i++) {
	            tempStr = str.substring(0, i);
	            int multiplier = str.length() / i;
	            String compare = multiplierFn(tempStr, multiplier);
	            if (str.equals(compare))
	                break;
	        }
	        System.out.println(tempStr);
	    }

	 

	    static String multiplierFn(String s, int m) {
	        String res = "";
	        for (int i = 0; i < m; i++)
	            res = res + s;
	        return res;
	    }
		
		
	

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the string");
		 * String s = sc.next();
		 */
		
		
		/*
		 * int len = s.length(); for(int i=len/2 ; i>=1 ; i--) { if(len%i == 0) { int m
		 * = len/i; String subS = s.substring(0,i); int j; for(j=1;j<m;j++) {
		 * if(!subS.equals(s.substring(j*i,i+j*i))) break; } if(j==m)
		 * System.out.println("true"); } } System.out.println("false");
		 */
		
		
		
		
		
		
		
		
		
		
		
		

		/*if (s.length() % 2 == 0) {
			String ss = s.substring(0, s.length() / 2);

			if (ss.concat(ss).equals(s)) {
				System.out.println("true");
			} else {
				for(int i=1;i<(s.length()/2)+1;i++) {
					
				}
				System.out.println("false");
			}
		}else {
			System.out.println("false");
		}*/

	}


