package RecurssionPrograms;

public class FactorialWithoutRecurssion {
	static int answer=1;
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			answer=answer*i;
		}
		System.out.println(answer);
	}

}
