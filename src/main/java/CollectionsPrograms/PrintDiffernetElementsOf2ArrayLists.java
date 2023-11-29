package CollectionsPrograms;

import java.util.ArrayList;

public class PrintDiffernetElementsOf2ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");

		a2.add("c");
		a2.add("d");
		a2.add("e");

		ArrayList<String> a3 = (ArrayList<String>) a1.clone();
		a3.addAll(a2);
		System.out.println(a3);

		a1.retainAll(a2);
		System.out.println(a1);

		a3.removeAll(a1);
		System.out.println(a3);
	}

}
