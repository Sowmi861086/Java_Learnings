package LambdaExpressionConcepts;

public class LamdaExpressionDemoWithReturnType {
	public static void main(String[] args) {
		
		Car3 c=() -> {
			int speed=50;
			System.out.println("speed is "+speed);
			return speed;
			
		};
		c.getSpeed();
	}

}
 