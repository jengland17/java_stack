package calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator test = new Calculator(10.5, "+", 5.2);
		Calculator test1 = new Calculator(30.0, "-", 15.0);
		
		test.performOperation();
		test.getResult();
		
		test1.performOperation();
		test1.getResult();
		
		
	}
	
	
}
