package hd.dp.test;

import java.util.Iterator;

import org.junit.Test;

import hd.dp.iterator.Book;
import hd.dp.iterator.BookList;

public class IteratorTest {

	@Test
	public void testIterator() {
		BookList bookList = new BookList();

		Book book1 = new Book("181020", "Java编程思想", 90);
		Book book2 = new Book("181021", "PMBOK", 199.0);

		bookList.addBook(book1);
		bookList.addBook(book2);

		Iterator iterator = bookList.iterator();
		while (iterator.hasNext()) {
			Book object = (Book) iterator.next();
			System.out.println(object);
		}
	}
}
