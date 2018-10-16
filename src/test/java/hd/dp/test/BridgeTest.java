package hd.dp.test;

import org.junit.Test;

import hd.dp.bridge.Bus;
import hd.dp.bridge.Car;
import hd.dp.bridge.Engine;
import hd.dp.bridge.Engine2000;
import hd.dp.bridge.Engine2200;
import hd.dp.bridge.Jeep;

public class BridgeTest {

	@Test
	public void testBridge() {
		Engine engine2000 = new Engine2000();
		Engine engine2200 = new Engine2200();

		Car bus1 = new Bus(engine2000);
		bus1.configure();

		Car jeep1 = new Jeep(engine2200);
		jeep1.configure();
	}
}
