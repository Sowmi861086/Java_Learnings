package RecurssionPrograms;

public class FactorialUsingRecurssion {
	static int answer;

	public static void main(String[] args) {
		int number = 8;
		System.out.println(fact(number));
	}

	static int fact(int number) {
		if (number < 1) {
			return answer;
		}
		answer = 1;
		answer = number * fact(number - 1);
		return answer;
	}

}
