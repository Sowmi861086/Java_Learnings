package OopsConcepts;

public class SingletonClassImplementation {

	private static SingletonClassImplementation s = new SingletonClassImplementation();

	private SingletonClassImplementation() {
	}

	public static SingletonClassImplementation getSingleTonClassImpl() {
		return s;
	}

}
