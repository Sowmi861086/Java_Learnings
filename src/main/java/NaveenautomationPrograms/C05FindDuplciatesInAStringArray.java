package NaveenautomationPrograms;

import java.util.HashSet;

public class C05FindDuplciatesInAStringArray {

	public static void main(String[] args) {
		String s = "java phy java html abc def abc phy";

		String[] a = s.split(" ");
		HashSet h = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (h.add(a[i]) == false) {
				System.out.println(a[i]);
			}
		}

	}
}
