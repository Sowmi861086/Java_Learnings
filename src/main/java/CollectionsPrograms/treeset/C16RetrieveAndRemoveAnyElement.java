package CollectionsPrograms.treeset;

import java.util.TreeSet;

public class C16RetrieveAndRemoveAnyElement {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();

		t.add(3);
		t.add(8);
		t.add(4);
		t.add(10);
		t.add(6);
		t.add(7);
		t.add(1);
		t.add(-1);
		System.out.println(t);
		
		System.out.println(	t.remove(7));
		
		System.out.println(t);
	
	}
}
