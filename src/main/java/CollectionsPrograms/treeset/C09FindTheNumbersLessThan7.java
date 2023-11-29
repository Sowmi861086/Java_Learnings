package CollectionsPrograms.treeset;

import java.util.TreeSet;

public class C09FindTheNumbersLessThan7 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(3);
		t.add(8);
		t.add(4);
		t.add(10);
		t.add(6);
		t.add(7);
		t.add(1);
		t.add(-1);
		System.out.println(t);
		
		t.headSet(7);
		System.out.println(t.headSet(7));

		
	}

}
