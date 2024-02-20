package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test (timeout = 200)
	public void testSum() {
		Calculator calculator = new Calculator();
		int expectedResult = 10;
		
		int result = calculator.sum(4, 6);
		
		assertTrue(result == expectedResult);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		Calculator calculator = new Calculator();
		int a = 20;
		int b = 0;
		
		calculator.divide(a, b);
	}
	
	//Junit does not takes into account because there is no annotation
	public void testSumWithoutAnnotation() {
		Calculator calculator = new Calculator();
		int expectedResult = 10;
		
		int result = calculator.sum(4, 6);
		
		assertTrue(result == expectedResult);
	}
	
	//Junit does not execute
	@Ignore
	public void testSumNegativeNumbers() {
		Calculator calculator = new Calculator();
		int expectedResult = -10;
		
		int result = calculator.sum(-4, -6);
		
		assertTrue(result == expectedResult);
	}
}
