package RecurssionPrograms;

public class SumOfNaturalNumbersWithRecurssion {

	static int answer = 1;

	public static void main(String[] args) {
		int n = 10;
		sum(n);
		System.out.println(answer);
	}

	static int sum(int n) {
		if (n <=1) {
			return answer;
		}
		return answer = n + sum(n - 1);
	}

}
