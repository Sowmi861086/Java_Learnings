package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesFromAnArray {

	public static void main(String[] args) {
		
		System.out.println(test());
	}

	public static List<Integer> test() {
		List<Integer> l = new ArrayList<Integer>();
		int[] array = { 3, 5, 3, 5, 4 };
		Set s = new HashSet<>();
		for (int i : array) {
			if (!s.contains(i)) {
				s.add(i);
			} else {
				l.add(i);
			}
		}
		return l;

	}
}
