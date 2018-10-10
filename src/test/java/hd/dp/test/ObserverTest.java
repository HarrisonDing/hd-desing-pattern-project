package hd.dp.test;

import org.junit.Test;

import hd.dp.observer.BookReader;
import hd.dp.observer.BookUser;

public class ObserverTest {

	@Test
	public void testObserver() {
		BookUser bookUser = new BookUser();
		bookUser.addObserver(new BookReader());
		bookUser.publishArticle("New World Coming", "What do you want?");
	}
}
