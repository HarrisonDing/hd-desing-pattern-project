package hd.dp.bridge;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	@Override
	public void configure() {
		System.out.print("Jeep: ");
		this.getEngine().installEngine();

	}

}
