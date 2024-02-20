package calculator;

public class TestCalculator {
	private Calculator calculator;
	
	public void testCalculatorSum() {
		calculator = new Calculator();
		int expectedResult = 4;
		int result = calculator.sum(2, 2);
		
		if (result == expectedResult) {
			System.out.println("Test ok");
		} else {
			System.out.println("Test failed");
		}
	}
}
