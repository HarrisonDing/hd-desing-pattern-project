package hd.dp.chain.of.responsibility;

public class CarBodyHandler extends CarHandler {

	@Override
	public void makeCar() {
		System.out.println("组装成体");
		if (this.handler != null) {
			this.handler.makeCar();
		}
	}

}
