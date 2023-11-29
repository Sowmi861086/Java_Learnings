package CollectionsPrograms.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class C04ReverseOrderOfTheExistingSet {

	public static void main(String[] args) {
		TreeSet<String> s=new TreeSet<String>(new MyComparator());
		s.add("red");
		s.add("green");
		s.add("pink");
		s.add("yellow");
		s.add("blue");
		System.out.println(s);
		
	}
	
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String obj1=(String)o1;
		String obj2=(String)o2;
		return -obj1.compareTo(obj2);
	}
	
}

