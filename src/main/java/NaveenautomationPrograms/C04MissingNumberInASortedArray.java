package NaveenautomationPrograms;

public class C04MissingNumberInASortedArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,6};
		int sum=0;
		int end=a[a.length-1];
		
		int sum2= (end*(end+1)/2);
		
		for(int i=0;i<a.length;i++) {
			sum= sum+a[i];
		}
		System.out.println(sum);
		System.out.println(sum2);
		
		System.out.println(sum2-sum);
	}

}
