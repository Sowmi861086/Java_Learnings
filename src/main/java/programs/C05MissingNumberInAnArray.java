package programs;

public class C05MissingNumberInAnArray {
	static int start,end,finalS;
	static int sum=0;
	public static void main(String[] args) {
		
	
		int[] a= {45,46,48,49};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		

		start=a[0];
		end=a.length;
		for(int i=0;i<end+1;i++) {
			finalS=finalS+start+1;
		}
		System.out.println(finalS-sum);
	}
	
	

}
