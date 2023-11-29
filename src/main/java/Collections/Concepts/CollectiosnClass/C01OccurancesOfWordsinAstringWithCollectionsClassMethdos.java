package Collections.Concepts.CollectiosnClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01OccurancesOfWordsinAstringWithCollectionsClassMethdos {
	
	public static void main(String[] args) {
		
		String s="Sow da mini Amp olu Sow da mini is a good girl Sow Sow Sow";
		String a[]= s.split(" ");
		List<String> c=Arrays.asList(a);
		System.out.println(	c);
		for (String string : c) {
		int i=Collections.frequency(c, string);
		System.out.println(string + "  "+i);
		
		}
	}

}
