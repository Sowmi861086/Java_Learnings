package programs;

public class C02LongestCommonPrefixRetarget2 {
	  public static void main(String[] args) {
	        String[] s = { "flower", "flow", "flewing" };

	        int minlen = 9999;
	        int index = 0, breakindex = 0;
	        for (String s1 : s) {
	            if (s1.length() < minlen) {
	                minlen = s1.length();
	                breakindex = index;
	            }
	            index++;
	        }

	        boolean breakflag = false;
	        String searchStr = s[breakindex];
	        while (searchStr.length()>0) {
	            String[] s4 = s;
	            int hits = 0;
	            for (String s3 : s4) {
	                if (!s3.contains(searchStr))
	                {
	                    searchStr = searchStr.substring(0,searchStr.length()-1);
	                    break;
	                }
	                else
	                    hits++;
	            }

	            if(hits==s4.length)
	                break;

	        }
	        System.out.println("Common word is - "+searchStr);
	    }
	}
