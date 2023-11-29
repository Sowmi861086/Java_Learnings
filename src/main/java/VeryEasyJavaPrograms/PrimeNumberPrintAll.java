package VeryEasyJavaPrograms;

public class PrimeNumberPrintAll {
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			boolean isPresnt = isPrime(i);
			if (isPresnt) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int i) {
		boolean isPresent = false;
		if((i==1)||(i==2)){
			isPresent=true;
		}
		
		for (int k = 2; k < i; k++) {
			if (i % k == 0) {
				isPresent = false;
				break;
			} else {
				isPresent = true;
			}
		}
		return isPresent;

	}

}
