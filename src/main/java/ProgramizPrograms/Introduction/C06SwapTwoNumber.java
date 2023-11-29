package ProgramizPrograms.Introduction;

public class C06SwapTwoNumber {
	public static void main(String[] args) {
		swap(23,56);
	}
	static void swap(int i, int j) {
		System.out.println("before "+i+ " "+j);
		int temp=i;
		i=j;
		j=temp;
		
		System.out.println(i+ " "+j);
	
	}

}
