package StringsPrograms;

public class C03StringPalindromeWithStringBuilder_GeeksForGeeks {
	public static void main(String[] args) {
		
		String s="abba";
		
		StringBuilder b=new StringBuilder(s);
		StringBuilder b1=b.reverse();
		
		if(b.toString().equals(s)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not paalindrome");
	}

}
