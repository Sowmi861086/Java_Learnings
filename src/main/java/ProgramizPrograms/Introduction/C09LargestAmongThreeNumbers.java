package ProgramizPrograms.Introduction;

public class C09LargestAmongThreeNumbers {
	public static void main(String[] args) {

		int i = 67, j = 68, k = 85;
		check(i, j, k);

	}

	static void check(int i, int j, int k) {
		if (i > j && i > k) {
			System.out.println(i + " is the largest number");
		} else if (j > k && j > i) {
			System.out.println(j + " is the largest number");
		} else if (k > i && k > j) {
			System.out.println(k + " is the largest number");
		}

	}

}
