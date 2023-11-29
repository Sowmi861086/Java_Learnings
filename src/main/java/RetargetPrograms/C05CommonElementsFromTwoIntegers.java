package RetargetPrograms;

public class C05CommonElementsFromTwoIntegers {
	public static void main(String[] args) {

		int a1[] = { 1, 6, 3, 8 };
		int a2[] = { 4, 7, 9, 3, 8 };

		int a3[];

		if (a1.length < a2.length) {
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a2.length; j++) {
					if(a1[i]==a2[j]) {
						System.out.println(a1[i]);
					}

				}

			}

		}
	}
}
