package hd.dp.test;

import org.junit.Test;

import hd.dp.decorator.Car;
import hd.dp.decorator.FlyCarDecorator;
import hd.dp.decorator.RunCar;
import hd.dp.decorator.SwimCarDecorator;

public class DecoratorTest {

	@Test
	public void testDecorator() {
		Car runCar = new RunCar();
		runCar.show();
		System.out.println(" =======================\n");

		FlyCarDecorator flyCarDecorator = new FlyCarDecorator(runCar);
		flyCarDecorator.show();
		System.out.println(" =======================\n");

		SwimCarDecorator swimCarDecorator = new SwimCarDecorator(flyCarDecorator);
		swimCarDecorator.show();
		System.out.println(" =======================\n");
	}
}
