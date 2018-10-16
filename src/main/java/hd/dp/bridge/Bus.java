package hd.dp.bridge;

public class Bus extends Car {

	public Bus(Engine engine) {
		super(engine);
	}

	@Override
	public void configure() {
		System.out.print("Bus: ");
		this.getEngine().installEngine();
	}

}
