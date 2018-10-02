package hd.dp.decorator;

public class FlyCarDecorator extends CarDecorator {

	public FlyCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void run() {

	}

	@Override
	public void show() {
		this.getCar().show();
		this.fly();
	}

	private void fly() {
		System.out.println("Could fly!");
	}
}
