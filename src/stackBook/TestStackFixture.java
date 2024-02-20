package stackBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStackFixture {
	
	private static Stack stack;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		stack = new Stack();
		System.out.println("Executed @BeforeAll.");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		stack = null;
		System.out.println("Executed @AfterAll.");
	}

	//runs before each test
	@BeforeEach
	void setUp() throws Exception {
		
		Book book1 = new Book("A Terra");
		Book book2 = new Book("A Roda");
		Book book3 = new Book("O Globo");
		Book book4 = new Book("A Lua");
		Book book5 = new Book("O Sol");
		
		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4);
		stack.push(book5);
	}

	//runs after each test
	@AfterEach
	void tearDown() throws Exception {
		int size = stack.count();
		
		while (size > 0 ) {
			stack.pop();
			size--;
		}
	}
	
	@Before
	public void setUp1() throws Exception {
		Book book1 = new Book("A Terra");
		Book book2 = new Book("A Roda");
		Book book3 = new Book("O Globo");
		Book book4 = new Book("A Lua");
		Book book5 = new Book("O Sol");
		
		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4);
		stack.push(book5);
		
		System.out.println("Executed @Before");
	}
	
	@After
	public void tearDown1() throws Exception {
		int size = stack.count();
		
		while (size > 0 ) {
			stack.pop();
			size--;
		}
		
		System.out.println("Executed @After");
	}

	@Test
	public void testNotAddBooksBeyondTheLimit() {
		try {
			stack.push(new Book("A Volta ao Mundo."));
			fail();
		} catch (ArrayStoreException e) {
			assertTrue(true);
		}
		Book book = stack.pop();
		
		assertEquals("O Sol", book.getTitle());
		System.out.println("Executed @Test 1: testNotAddBooksBeyondTheLimit()");
	}
	
	@Test(expected = ArrayStoreException.class)
	public void testNotAddBooksBeyondTheLimitException() {
		stack.push(new Book("A Volta ao Mundo."));
		
		System.out.println("Executed @Test 1: testNotAddBooksBeyondTheLimit()");
	}
	
	@Test
	public void testNotAddBookOutsideTheStandardName() {
		stack.pop();
		stack.push(new Book("Nao Vale"));
		Book book = stack.pop();
		
		assertEquals("A Lua", book.getTitle());
		System.out.println("Executed @Test 2: testNotAddBookOutsideTheStandardName()");
	}

}
