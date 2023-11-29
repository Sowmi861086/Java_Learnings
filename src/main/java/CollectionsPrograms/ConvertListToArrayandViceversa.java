package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertListToArrayandViceversa {
	public static void main(String[] args) {
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		
		Integer[] abc=new Integer[s.size()];
		
		/**
		 * List to arrray
		 */
		
		abc=s.toArray(abc);
		for (Integer integer : abc) {
			System.out.println(integer);
		}
		
	}

}
