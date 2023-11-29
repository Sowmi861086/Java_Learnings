package ProgramizPrograms.Introduction;

public class C05ComputeQotientAndReminder {
	public static void main(String[] args) {
		compute(561, 7);

	}

	static void compute(int dividend, int divisor) {
		System.out.println(dividend / divisor + " this is quotient");
		System.out.println(dividend % divisor + " this is reminder");

	}
}
