package LangPackgFundamentals;
import java.lang.reflect.Method;

public class ObjectClassmethods {

	public static void main(String[] args) throws ClassNotFoundException {
		int count=0;
		Class c = Class.forName("java.util.Collections");
		Method[] m = c.getDeclaredMethods();
		for (Method method : m) {
			String s = method.getName();
			System.out.println(s);
			count++;
		}
		System.out.println(count);
	}

}
