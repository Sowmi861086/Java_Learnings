package programs;

public class C03ReverseArrayElements {
	static int[] a = { 3, 4, 5, 6, 7 };

	public static void main(String[] args) {

		int[] duplicate = a.clone();
		int len = a.length;

		for (int i = 0; i < a.length; i++) {
			a[i] = duplicate[len - 1];
			len--;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
