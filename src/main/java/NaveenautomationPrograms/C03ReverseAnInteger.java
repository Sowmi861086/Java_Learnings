package NaveenautomationPrograms;

public class C03ReverseAnInteger {
	public static void main(String[] args) {
		int i =23456;
		
		int rev=0;
		while(i !=0) {
		rev= rev*10 + i%10;
		i=i/10;
		
	}
		System.out.println(rev);
	}
}
