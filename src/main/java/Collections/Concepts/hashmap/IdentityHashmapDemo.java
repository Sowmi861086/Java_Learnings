package Collections.Concepts.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo {
	public static void main(String[] args) {

		HashMap m = new HashMap();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "sow");
		m.put(i2, "mini");
		System.out.println(m);

		
		IdentityHashMap m2 = new IdentityHashMap();
		Integer i11 = new Integer(20);
		Integer i22 = new Integer(20);

		m.put(i11, "sowdi");
		m.put(i22, "minir");
		System.out.println(m2);
	}

}
