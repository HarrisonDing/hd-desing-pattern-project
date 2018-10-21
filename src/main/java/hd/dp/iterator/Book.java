package hd.dp.iterator;

public class Book {
	private String	name;
	private String	isbn;
	private double	price;

	public Book(String name, String isbn, double price) {
		super();
		this.name = name;
		this.isbn = isbn;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + ", price=" + price + "]";
	}

}
