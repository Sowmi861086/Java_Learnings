package CollectionsPrograms.treeset;

import java.util.TreeSet;

public class C08CompareTwoTreesets {
	
	public static void main(String[] args) {
		TreeSet<String> s=new TreeSet<String>();
		s.add("red");
		s.add("green");
		
		System.out.println(s);
		
		TreeSet<String> s2=new TreeSet<String>();
		s2.add("pink");
		s2.add("yellow");
		s2.add("blue");
		
		System.out.println(s2);
		
		s.addAll(s2);
		System.out.println(s);
		
	}

}
