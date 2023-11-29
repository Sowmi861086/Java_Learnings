package programs.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C06StringAndNiumberReverseOnlyStrings {
	
	public static void main(String[] args) {
		
		String s="test12popn34Java32Python";
		
		Pattern p=Pattern.compile("\\d");
		
		Matcher m=p.matcher(s);
		Map<Integer ,String> map=new LinkedHashMap<Integer,String>();
		int i=0;
		while(m.find()) {
			map.put(m.start(), m.group());
		}
		System.out.println(map);
		String k =m.replaceAll(" ");
		System.out.println(k);
		
		//String []z= k.split(" ");
	
		StringBuffer sb =new StringBuffer(k);
		
		//StringBuffer [] sba=sb.
		
		
		
	}

}
