package stackBook;

public class StackTest {
	Stack stack = new Stack();
	
	public boolean testRemoveLastBook() {
		Book book = new Book("A Fortaleza");
		stack.push(book);
		
		book = new Book("A Emboscada");
		stack.push(book);
		
		book = new Book("O Naufrago");
		stack.push(book);
		
		String expectedResult = "O Naufrago";
		
		return stack.pop().getTitle().equals(expectedResult);
	}
	
	public boolean testNotAddBooksBeyondTheLimit() {
		Stack stack = new Stack();
		
		Book book1 = new Book("A Fortaleza");
		Book book2 = new Book("A Emboscada");
		Book book3 = new Book("O Palhaço");
		Book book4 = new Book("A Terra");
		Book book5 = new Book("O Sol");
		Book book6 = new Book("A Lua");
		
		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4);
		stack.push(book5);
		stack.push(book6);
		
		String expectedResult = "O Sol";
		
		return stack.pop().getTitle().equals(expectedResult);
	}
	
	public boolean testNotAddBookOutsideTheStandardName() {
		Stack stack = new Stack();
		Book book1 = new Book("A Fortaleza");
		stack.push(book1);
		
		Book book2 = new Book("Homem de Ferro");
		stack.push(book2);
		
		String expectedResult = "A Fortaleza";
		
		return stack.pop().getTitle().equals(expectedResult);
	}
}
