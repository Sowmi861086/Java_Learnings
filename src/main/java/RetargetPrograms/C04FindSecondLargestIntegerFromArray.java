package RetargetPrograms;

import java.util.Arrays;

public class C04FindSecondLargestIntegerFromArray {
	public static void main(String[] args) {
		
		int a[]= {3,6,8,9,1,45,76,1,3,6};
		
		Arrays.sort(a);
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int index=a.length-2;
		System.out.println(a[index]);
	}

}
