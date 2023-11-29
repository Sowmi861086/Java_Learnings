package CollectionsPrograms.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class C02IterateThroughAllElementsInHashset {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<>();
		s.add("yellow");
		s.add("orange");
		s.add("blue");
		s.add("white");
		s.add("green");
		s.add("pink");
		s.add("purple");
		s.add("cyan");
		System.out.println(s);

		/*
		 * for (String x : s) { if(x.equals("pink")) { s.remove(x); } }
		 */

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			String x = (String) itr.next();
			if (x.equals("pink")) {
				itr.remove();
			}
			System.out.println(s);
		}

	}

}
