package CollectionsPrograms.hashset;

import java.util.HashSet;

public class C04EmptyJHashSet {
	
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
		System.out.println(s.removeAll(s));
		System.out.println(s);
	}

}
