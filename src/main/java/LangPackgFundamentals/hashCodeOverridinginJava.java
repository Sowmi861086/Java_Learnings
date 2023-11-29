package LangPackgFundamentals;

public class hashCodeOverridinginJava {

	public static void main(String[] args) {

		Student1 s1 = new Student1(1, "sow");
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());

	}

}

class Student1 {

	int id;
	String name;

	public Student1(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int hashCode() {

		return id;

	}
}