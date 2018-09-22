package hd.dp.test;

import org.junit.Test;

import hd.dp.simplefactory.entity.Apple;
import hd.dp.simplefactory.entity.Banana;
import hd.dp.simplefactory.entity.FruitI;
import hd.dp.simplefactory.factory.FruitFactory;

public class SimpleFactoryTest {

	@Test
	public void testEntity() {
		FruitI apple = new Apple();
		Banana banana = new Banana();

		apple.create();
		banana.create();
	}

	@Test
	public void testSimpleFactory() {
		FruitI fruitI = null;
		fruitI = FruitFactory.getFruit("apple");
		fruitI.create();
		fruitI = FruitFactory.getFruit("Banana");
		fruitI.create();
	}
}
