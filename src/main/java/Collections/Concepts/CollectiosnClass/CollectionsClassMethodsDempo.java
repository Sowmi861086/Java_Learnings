package Collections.Concepts.CollectiosnClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethodsDempo {
	public static void main(String[] args) {
		String s="Sow da mini Amp olu Sow da mini is a good girl Sow Sow Sow";
		String s2="Sow da mini Amp olu abc def dghj jkl mnd";
		String s3="cd ef";
		
		String a[]= s.split(" ");
		String a2[]= s2.split(" ");
		String a3[]=s3.split(" ");
		
		List<String> c=Arrays.asList(a);
		List<String> c2=Arrays.asList(a2);
		List<String> c3=Arrays.asList(a3);
		Collections.sort(c);
		System.out.println(c);
		int index=Collections.binarySearch(c, "Sow");
		System.out.println("the binary search method "+ index);
		
		
		boolean b=Collections.disjoint(c, c2);
		System.out.println(b);
		boolean b1=Collections.disjoint(c, c3);
		System.out.println(b1);
		
		Collections.rotate(c, 2);
		System.out.println(c);
		
		Collections.swap(c3, 0, 1);
		System.out.println(c3);
		
	}

}
