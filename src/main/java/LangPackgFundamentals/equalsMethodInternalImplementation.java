package LangPackgFundamentals;

public class equalsMethodInternalImplementation {

	public static void main(String[] args) {
		Student3 s1 = new Student3(1, "sow");
		Student3 s2 = new Student3(2, "sowdamini");
		Student3 s3 = new Student3(1, "sow");
		Student3 s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}

class Student3 {

	int id;
	String name;

	public Student3(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public boolean equals(Object o) {
		try {
			int id1 = this.id;
			String name1 = this.name;

			Student3 s = (Student3) o;
			int id2 = s.id;
			String name2 = s.name;

			if (name1.equals(name2) && id1 == id2) {
				return true;
			} else {
				return false;
			}

		} catch (ClassCastException e) {
			return false;
		}
	}
}