package hd.dp.chain.of.responsibility;

public class CarTailHandler extends CarHandler {

	@Override
	public void makeCar() {
		System.out.println("组装车尾");
		if (this.handler != null) {
			this.handler.makeCar();
		}
	}

}
