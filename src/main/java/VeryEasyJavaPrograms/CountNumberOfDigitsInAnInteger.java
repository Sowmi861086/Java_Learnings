package VeryEasyJavaPrograms;

public class CountNumberOfDigitsInAnInteger {
	public static void main(String[] args) {
		
		int i=124574389;
		int count=1;
		
		while(i/10>0) {
			count++;
			i=i/10;
		}
		System.out.println(count);
		
	}

}
