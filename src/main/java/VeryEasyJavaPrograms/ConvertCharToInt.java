package VeryEasyJavaPrograms;

public class ConvertCharToInt {
	public static void main(String[] args) {
		
		char ch='a';
		int i=Character.getNumericValue(ch);
		System.out.println(i);
		
		
		int j=ch;
		System.out.println(j);
		
		int k=Integer.parseInt(String.valueOf('6'));
		System.out.println(k);
	}

}
