package CollectionsPrograms.treeset;

import java.util.TreeSet;

public class C05GetFirstAndLastElementOfTreeset {
	public static void main(String[] args) {
			TreeSet<String> s=new TreeSet<String>();
			s.add("red");
			s.add("green");
			s.add("pink");
			s.add("yellow");
			s.add("blue");
			System.out.println(s);
			System.out.println(s.first());
			System.out.println(s.last());
		
	}

}
