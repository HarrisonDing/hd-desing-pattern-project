package hd.dp.test;

import org.junit.Test;

import hd.dp.chain.of.responsibility.CarBodyHandler;
import hd.dp.chain.of.responsibility.CarHeadHandler;
import hd.dp.chain.of.responsibility.CarTailHandler;

public class CoRTest {
	@Test
	public void testCoR() {
		CarHeadHandler headHandler = new CarHeadHandler();
		headHandler.setHandler(new CarBodyHandler()).setHandler(new CarTailHandler());
		headHandler.makeCar();
	}
}
