package hd.dp.chain.of.responsibility;

public abstract class CarHandler {
	protected CarHandler handler;

	public abstract void makeCar();

	public CarHandler setHandler(CarHandler handler) {
		this.handler = handler;

		return this.handler;
	}
}
