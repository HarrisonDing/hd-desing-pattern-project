package hd.dp.decorator;

public class RunCar implements Car {

	@Override
	public void run() {
		System.out.println("Could run！");
	}

	@Override
	public void show() {
		this.run();
	}

}
