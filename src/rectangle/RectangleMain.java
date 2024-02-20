package rectangle;
public class RectangleMain {

	public static void main(String[] args) {
		RectangleTest test = new RectangleTest();
		boolean result;
		
		result = test.testCalculateArea();
		System.out.println("testCalculateArea " + result);

		result = test.testCalculatePerimeter();
		System.out.println("testCalculatePerimeter " + result);

	}

}
