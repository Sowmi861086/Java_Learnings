package LangPackgFundamentals;

public class toStringInCustomizedClassOutput {

	public static void main(String[] args) {
		Student s1 = new Student(1, "sow");
		Student s2 = new Student(2, "sowdi");

		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}

}

class Student {

	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * For customized classes in java the toString method is explicitly overridden.
	 * other wise it displays the Classname@Hashcode value
	 */
	public String toString() {

		return id + " " + name;

	}

}