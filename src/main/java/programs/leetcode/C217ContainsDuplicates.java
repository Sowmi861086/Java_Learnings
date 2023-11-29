package programs.leetcode;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author Sowdamini.Ampolu
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 *
 */
public class C217ContainsDuplicates {
	public static void main(String[] args) {
		
		int[] arrayno= {1,1,1,3,3,4,3,2,4,2};
		boolean b=test(arrayno);
		System.out.println(b);
		
	}	
	
	
	public static boolean test(int[] arrayno) {
		boolean flag=false;
		Set s=new HashSet();
		for (int i : arrayno) {
			if(s.add(i)==false) {
				flag= true;
			}else {
				flag= false;
			}
		}
		return flag;
	}

}
