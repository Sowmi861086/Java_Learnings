package RetargetPrograms;

import java.util.HashSet;

public class C03FindDuplicatesInAnArray {
	public static void main(String[] args) {

		int[] a = { 1, 4, 5, 7, 3, 4 ,5};
		int fina;
		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (h.add(a[i]) == false) {
				fina = a[i];
				System.out.println(fina);
			}

		}

	}
}