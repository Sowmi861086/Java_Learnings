package programs;

import java.util.ArrayList;

public class UncommonWordsFrom2Sentences {
	static ArrayList al=new ArrayList<>();
	public static void main(String[] args) {
		
		String s1="This apple is sweet";
		String s2="This apple is sour";
		String s1arr[]= s1.split(" ");
		String s2arr[]= s2.split(" ");
		
		for(int i=0;i<s1arr.length;i++) {
			if(s1.contains(s2arr[i])) {
				s1.replace(s2arr[i],"").trim();
			}else {
				al.add(s1arr[i]);
				al.add(s2arr[i]);
				
			}
			
		}
		System.out.println(al);
		
	}

}
