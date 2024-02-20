package stackBook;

import java.util.ArrayList;

public class Stack {
	private int limit = 5;
	private ArrayList<Book> stack = new ArrayList<Book>();
	
	public void push (Book book) {
		if (stack.size() >= limit) {
			throw new ArrayStoreException();
		}
		
		if (!book.getTitle().startsWith("A") && !book.getTitle().startsWith("O")) {
			return;
		}
		
		stack.add(book);
	}
	
	public Book pop() {
		Book book = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return book;
	}
	
	public int count () {
		return stack.size();
	}
}
