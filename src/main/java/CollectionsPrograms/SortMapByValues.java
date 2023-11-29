package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortMapByValues {
	public static void main(String[] args) {
		
		HashMap<Integer, String> m=new HashMap();
		m.put(1, "agjkre");
		m.put(2, "baewafge");
		m.put(3, "afrwte");
		
		ArrayList<String> c=new ArrayList<String>(m.values());
		Collections.sort(c);
		System.out.println(c);
		
		
		
		
		
	}

}
