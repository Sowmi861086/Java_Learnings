package CollectionsPrograms.hashset;

import java.util.HashSet;

public class C06CloneAHashSet {
	
	public static void main(String[] args) {
		
		HashSet< String > s=new HashSet<>();
		s.add("yellow");
		s.add("orange");
		s.add("blue");
		s.add("white");
		s.add("green");
		s.add("pink");
		s.add("purple");
		s.add("cyan");
		
		HashSet< String > s2=new HashSet<>();
		s2=(HashSet<String>) s.clone();
		System.out.println(s2);
	}

}
