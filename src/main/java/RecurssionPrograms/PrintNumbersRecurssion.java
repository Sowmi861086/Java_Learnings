package RecurssionPrograms;

public class PrintNumbersRecurssion {
	static int n=0;
	public static void main(String[] args) {
		
		printNumbers(n+1);
		
	}

	 static void printNumbers(int n) {
		 
		 /**
		  * base condition
		  */
		 if(n>10) {
			 return;
		 }
		 
		 /*
		  * Body
		  */
		 System.out.println(n);
		 
		 /**
		  * Recursion
		  */
		 printNumbers(n+1);
		 
		
	}

}
