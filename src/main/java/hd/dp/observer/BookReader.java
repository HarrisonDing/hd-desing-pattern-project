package hd.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class BookReader implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(String.format("Author has published a new book: %s", "go to read now"));
	}

}
