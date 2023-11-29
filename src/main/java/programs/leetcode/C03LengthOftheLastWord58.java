package programs.leetcode;

import java.util.Scanner;

public class C03LengthOftheLastWord58 {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("enter the string");
		 */
		String s = "luffy is still joyboy";
		
		String[] arr=s.split(" ");
		String y=arr[arr.length-1];
		System.out.println(y);
		System.out.println(y.length());
		
		

	}

}
