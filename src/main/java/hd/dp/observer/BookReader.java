package hd.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class BookReader implements Observer {
	private Article article = null;

	@Override
	public void update(Observable o, Object arg) {
		article = (Article) arg;
		System.out.println(String.format("Author has published a new book: %s", "go to read now"));
		System.out.println(
				String.format("Read a new book, title: %s, content: %s", article.getTitle(), article.getContent()));
	}

}
