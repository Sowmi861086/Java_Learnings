package RetargetPrograms;

public class C10FindAllPairWhoseSumIsEqualtoANumber {
	
	public static void main(String[] args) {

	int a[] = {9,5,14,3,1,15,6};
	int num=20;
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=1;j<a.length;j++) {
			if(a[i]+a[j]==num) {
				System.out.println(a[i]+ " "+a[j]);
			}
			
		}
	}
	
	

}
	
}