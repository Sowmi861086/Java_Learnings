package LangPackgFundamentals;

public class equalsMethodUsesObjectClassmethod {
	public static void main(String[] args) {
		Student2 s1 = new Student2(1, "sow");
		Student2 s2 = new Student2(2, "sowdamini");
		Student2 s3 = new Student2(1, "sow");
		Student2 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}

class Student2 {

	int id;
	String name;

	public Student2(int id, String name) {

		this.id = id;
		this.name = name;

	}
}