package stackBook;

public class StackMain {

	public static void main(String[] args) {
		StackTest test = new StackTest();
		boolean result;
		
		result = test.testNotAddBooksBeyondTheLimit();
		System.out.println("testNotAddBooksBeyondTheLimit " + result);
		
		result = test.testRemoveLastBook();
		System.out.println("testRemoveLastBook " + result);

		result = test.testNotAddBookOutsideTheStandardName();
		System.out.println("testNotAddBookOutsideTheStandardName " + result);
	}

}
