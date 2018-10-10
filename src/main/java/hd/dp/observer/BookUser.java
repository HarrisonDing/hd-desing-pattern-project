package hd.dp.observer;

import java.util.Observable;

public class BookUser extends Observable {

	public void publishArticle(String title, String content) {
		System.out.println(String.format("Author publish a new article, title: %s, content: %s", title, content));
		Article article = new Article();
		article.setTitle(title);
		article.setContent(content);
		this.setChanged();
		this.notifyObservers(article);
	}
}
