package CollectionsPrograms;

import java.util.ArrayList;

public class JoinTwoLists {
	public static void main(String[] args) {
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		
		s.addAll(l);
		System.out.println(s);
		
	}

}
