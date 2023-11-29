package RegularExpressions;

import java.util.HashMap;
import java.util.Map.Entry;

public class C03CountOccurancesOfTheWordsInAString {

	public static void main(String[] args) {
		 int counter = 0;
	      //  String a = "To associate myself with an organization that provides a challenging job and an opportunity to provide innovative and diligent work.";
		 String a = "Sow da mini Amp olu Sow da mini is a good girl Sow Sow Sow";
	        String[] b = a.split(" "); // stored in array and splitted
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        for (int i = 0; i < b.length; i++) {
	            String key = b[i];
	            int freq = map.getOrDefault(key, 0);
	            map.put(key, ++freq);
	        }
			/*
			 * for (Entry<String, Integer> result : freqMap.entrySet()) {
			 * System.out.println(result.getKey() + " " + result.getValue()); }
			 */
		
	        System.out.println(map);
	        
	}
		
}	
