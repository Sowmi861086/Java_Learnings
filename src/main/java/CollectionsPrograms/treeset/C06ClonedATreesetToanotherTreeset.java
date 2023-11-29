package CollectionsPrograms.treeset;

import java.util.TreeSet;

public class C06ClonedATreesetToanotherTreeset {
	public static void main(String[] args) {

		TreeSet<String> s = new TreeSet<String>();
		s.add("red");
		s.add("green");
		s.add("pink");
		s.add("yellow");
		s.add("blue");
		
		TreeSet<String> s2 = new TreeSet<String>();
		
		s2=(TreeSet<String>) s.clone();
		
		System.out.println(s2);
	}
}
