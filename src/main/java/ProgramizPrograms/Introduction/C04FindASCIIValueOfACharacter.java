package ProgramizPrograms.Introduction;

public class C04FindASCIIValueOfACharacter {
	public static void main(String[] args) {
		char ch = 'i';
		getAscci(ch);
		getAscciByInt();
		getAscciBycast(ch);
		printAllAscii();

	}

	static int getAscci(char ch) {
		int i = ch;
		System.out.println(i);
		return i;
	}
	
	static int getAscciByInt() {
		int i = 'i';
		System.out.println(i);
		return i;
	}
	
	static int getAscciBycast(char ch) {
		int i = (char)ch;
		System.out.println(i);
		return i;
	}
	
	static void printAllAscii() {
		for(int i=0;i<255;i++) {
			System.out.println("The ascii of the character "+(char)i+  " = "+i);
		}
	}
}
