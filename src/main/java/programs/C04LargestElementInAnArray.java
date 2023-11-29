package programs;

import java.util.Arrays;

public class C04LargestElementInAnArray {
	public static void main(String[] args) {
		int[] i = { 2, 6, 4, 8, 9, 12, 1 };

		Arrays.sort(i);
		System.out.println(i[i.length - 1]);
	}

}
