package LambdaExpressionConcepts;

public class LamdaExpressionDemoWithParameters {
	public static void main(String[] args) {
		
		Car2 c=(speed,model) -> {
			System.out.println("speed is "+ speed);
			System.out.println("model is "+ model);
			
		};
		c.drive(50, "audi");
	}

}
