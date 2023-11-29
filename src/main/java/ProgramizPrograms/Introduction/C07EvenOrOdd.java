package ProgramizPrograms.Introduction;

public class C07EvenOrOdd {
	public static void main(String[] args) {
		int i = 23;
		check(i);

	}

	static void check(int i) {
		if (i % 2 == 0) {
			System.out.println("It is an even number");
		} else if (i % 2 == 1) {
			System.out.println("It is an odd integer");

		} else {
			System.out.println("It is  not a natural number");
		}
	}

}
