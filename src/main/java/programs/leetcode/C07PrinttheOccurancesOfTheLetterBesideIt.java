package programs.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C07PrinttheOccurancesOfTheLetterBesideIt {
	public static void main(String[] args) {
		
		String s="aaabbbbbbbcccccccd";
		String[] arr=s.split("");
		System.out.println(arr[0]);
		
		HashMap<String,Integer> m=new HashMap();
		
		for (String string : arr) {
			if(m.containsKey(string)) {
				m.put(string, m.get(string)+1);
			}else {
				m.put(string, 1);
			}
		}
		
		
		Iterator<String> it = m.keySet().iterator();       
		while(it.hasNext())  
		{  
		String key=(String)it.next();  
		System.out.print(key+""+m.get(key));  
		}  
		
		
	}

}
