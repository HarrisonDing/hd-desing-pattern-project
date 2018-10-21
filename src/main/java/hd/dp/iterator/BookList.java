package hd.dp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	private List<Book>	bookList;
	private int			index;

	public BookList() {
		bookList = new ArrayList<>();
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public boolean removeBook(Book book) {
		return bookList.remove(book);
	}

	public Iterator iterator() {
		return new Itr();
	}

	private class Itr implements Iterator {
		public boolean hasNext() {
			if (index >= bookList.size()) {
				return false;
			}

			return true;
		}

		public Object next() {
			return bookList.get(index++);
		}

		public void remove(Object obj) {

		}
	}

}
