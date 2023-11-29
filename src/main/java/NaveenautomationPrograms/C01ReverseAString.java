package NaveenautomationPrograms;

public class C01ReverseAString {
	public static void main(String[] args) {
		
		String s="Sowdamini";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}

}
