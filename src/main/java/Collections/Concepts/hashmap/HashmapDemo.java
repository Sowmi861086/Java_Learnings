package Collections.Concepts.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {
	public static void main(String[] args) {
		
		HashMap< String, Integer> map=new HashMap< String, Integer>();
		map.put("chi", 700);
		map.put("bal", 800);
		map.put("ven", 200);
		map.put("nag", 500);
		System.out.println(map);
		System.out.println(map.put("chi", 1000));
		
		Set s=map.keySet();
		System.out.println(s);
		
		Collection c=map.values();
		System.out.println(c);
		
		
		Set s1=map.entrySet();
		System.out.println(s1);
		
		Iterator i= s1.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> e= (Entry<String, Integer>) i.next();
			e.getKey();
			e.getValue();
		}
	}

}
