package hd.dp.decorator;

public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void run() {

	}

	@Override
	public void show() {
		this.getCar().show();
		this.swim();
	}

	private void swim() {
		System.out.println("Could swim");
	}
}
