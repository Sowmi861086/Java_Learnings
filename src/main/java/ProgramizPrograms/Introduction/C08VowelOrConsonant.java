package ProgramizPrograms.Introduction;

public class C08VowelOrConsonant {
	public static void main(String[] args) {
		char c = 'k';
		check(c);
		check1(c);

	}

	static void check1(char c) {

		switch (c) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;

		default:
			System.out.println("It is a consonant");
		}

	}

	static void check(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			System.out.println(c + " It is a vowel");
		} else {
			System.out.println(c + "  It is a consonant");
		}
	}
}
