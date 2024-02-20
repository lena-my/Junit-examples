package rectangle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class JunitRectangle {
	
	private int base;
	private int height;
	private int area;
	
	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][]{
			{10,20,200},
			{10,30,300}
		});
	}

	public JunitRectangle(int base, int height, int area) {
		this.base = base;
		this.height = height;
		this.area = area;
	}
	
	@Test
	void testCalculateArea() {
		Rectangle rectangle = new Rectangle(base, height);
		int result = rectangle.calculateArea();
		
		assertEquals(area, result);
	}

	@Ignore
	void testCalculatePerimeter() {
		fail("Not yet implemented");
	}

}
