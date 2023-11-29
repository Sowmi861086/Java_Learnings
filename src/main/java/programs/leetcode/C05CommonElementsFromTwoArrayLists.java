package programs.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class C05CommonElementsFromTwoArrayLists {

	public static void main(String[] args) {

		ArrayList s = new ArrayList<>();
		s.add("A");
		s.add("B");
		s.add("c");
		s.add("Z");

		ArrayList s1 = new ArrayList<>();
		s1.add("A");
		s1.add("B");
		s1.add("D");
		s1.add("L");

		for (Object object : s) {
			if (s1.contains(object)) {
				System.out.println(object);

			}

		}

	}
}
