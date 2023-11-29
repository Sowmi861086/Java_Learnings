package programs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortPeopleBasedOnHeight {
	static String name[] = { "Mary", "Emma", "John" };
	static int heights[] = { 180, 136, 152 };

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>(new MyComparator());
		for (int i = 0; i < name.length; i++) {
			map.put(heights[i], name[i]);

		}
		System.out.println(map);

	}
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}

}
