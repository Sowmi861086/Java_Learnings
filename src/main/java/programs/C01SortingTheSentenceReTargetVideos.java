package programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class C01SortingTheSentenceReTargetVideos {
	static String finalValue ="";
	public static void main(String[] args) {

		String s = "is2 sentence4 this1 a3";
		String[] words = s.split(" ");

		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i <=words.length-1; i++) {

			int a = Character.getNumericValue(words[i].charAt(words[i].length()-1));
			String b = words[i].substring(0, words[i].length() - 1);
			map.put(a, b);

		}
		System.out.println(map);
		Collection<String> x=map.values();
		for (String string : x) {
			finalValue=finalValue+ string+ " ";
		}
		
		System.out.println(finalValue);
	}
}
