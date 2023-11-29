package VeryEasyJavaPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n=10;
		boolean isPresent=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPresent=false;
				break;
			}else {
				isPresent=true;
			}
		}
		
		if(isPresent==false) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
	}

}
