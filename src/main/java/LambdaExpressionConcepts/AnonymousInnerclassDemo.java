package LambdaExpressionConcepts;

public class AnonymousInnerclassDemo {
	public static void main(String[] args) {
		Car c = new Car() {

			@Override
			public void drive() {
				System.out.println("driving audi from anonymous inner class");
			}
		};

		c.drive();
		
		
	}
}