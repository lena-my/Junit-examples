package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyFixture {

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		System.out.println("This method runs one a time before the firts test.");
	}
	
	@AfterClass
	public void tearDownAfterClass() throws Exception {
		System.out.println("This method ruuns once a time after the last test.");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("This method runs before each test");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("This method runs after each test");
	}

	@Test
	public void test1() { 
		System.out.println("I am Test 1.");
	}
	
	@Test
	public void test2() {
		System.out.println("I am Test 2.");
	}
	
}
