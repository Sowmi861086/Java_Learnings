package CollectionsPrograms.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class C02IterateAllElementsInATreeset {

	public static void main(String[] args) {

		TreeSet<String> s = new TreeSet<String>();
		s.add("red");
		s.add("green");
		s.add("pink");

		System.out.println(s);
		
		//Or use for or foreach loops to iterate.

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();

			if (s1.equals("red")) {
				System.out.println(s1+ " the elements are iterated ");
			}
			else
				System.out.println(s1+ " elemnets are not iterated ");

		}

	}

}
