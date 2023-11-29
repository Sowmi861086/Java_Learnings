package NaveenautomationPrograms;

import java.util.HashMap;

public class C22FindDuplicatesInaAnArrayString {
	public static void main(String[] args) {
		
		String s="java phy html java html sow damini";
		String a[] =s.split(" ");
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for (String word : a) {
			
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
				
			}else {
				map.put(word, 1);
			}
			
		}
		
		System.out.println(map);
		
	}

}
