package calculator;

public class Calculator {
	public int sum (int a, int b) {
		return a + b;
	}
	
	public int divide (int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			return a/b;
		}
	}
}
