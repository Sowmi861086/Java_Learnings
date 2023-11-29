package CollectionsPrograms.treeset;

import java.util.TreeSet;

public class C03AddAllElementsToAnotherTreeSet {
	
public static void main(String[] args) {
		
		TreeSet<String> s=new TreeSet<String>();
		s.add("red");
		s.add("green");
		s.add("pink");
		
		System.out.println(s);
		
		TreeSet<String> s2=new TreeSet<String>(s);
		s2.add("yellow");
		s2.add("blue");
		System.out.println(s2);

	}

}
