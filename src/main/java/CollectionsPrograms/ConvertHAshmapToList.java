package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class ConvertHAshmapToList {
	public static void main(String[] args) {
		
		HashMap<Integer, String> m=new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		
		System.out.println(m);
		
		ArrayList<Integer> a=new ArrayList(m.keySet());
		ArrayList<String> s=new ArrayList(m.values());
		System.out.println(a);
		System.out.println(s);
	}

}
