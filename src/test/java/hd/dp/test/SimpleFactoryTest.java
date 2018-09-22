package hd.dp.test;

import org.junit.Test;

import hd.dp.simplefactory.entity.Apple;
import hd.dp.simplefactory.entity.Banana;

public class SimpleFactoryTest {

	@Test
	public void testSimpleFactory() {
		Apple apple = new Apple();
		Banana banana = new Banana();

		apple.create();
		banana.create();
	}
}
