package rectangle;
public class RectangleTest {

	Rectangle rectangle;
	
	public boolean testCalculateArea() {
		
		rectangle = new Rectangle(10, 2);
		int expectedResult = 20;
		int result = rectangle.calculateArea();
		
		if (result == expectedResult) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testCalculatePerimeter() {
		rectangle = new Rectangle(10, 2);
		int expectedResult = 24;
		int result = rectangle.calculatePerimeter();
		
		if (result == expectedResult) {
			return true;
		} else {
			return false; 
		}
	}
}
