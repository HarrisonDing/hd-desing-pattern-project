package hd.dp.chain.of.responsibility;

public class CarHeadHandler extends CarHandler {

	@Override
	public void makeCar() {
		System.out.println("组装车头");
		if (this.handler != null) {
			this.handler.makeCar();
		}
	}

}
