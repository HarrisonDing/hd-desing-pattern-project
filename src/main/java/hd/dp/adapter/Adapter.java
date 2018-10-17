package hd.dp.adapter;

// Another way to use in Extends Current
public class Adapter {

	private Current current;

	public Adapter(Current current) {
		this.current = current;
	}

	public void use110v() {
		System.out.println("To use current in adapter");
		this.current.use220v();
	}
}
