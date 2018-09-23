package hd.dp.test;

import org.junit.Test;

import hd.dp.abstractfactory.entity.AnimalI;
import hd.dp.abstractfactory.factory.AbstractFactoryI;
import hd.dp.abstractfactory.factory.NorthFactory;
import hd.dp.abstractfactory.factory.SouthFactory;

public class AbstractFactoryTest {

	@Test
	public void testAbstractFactory() {
		AbstractFactoryI factory = new NorthFactory();
		AnimalI wolf = factory.getWolf();
		wolf.born();

		AnimalI pig = factory.getPig();
		pig.born();

		factory = new SouthFactory();
		AnimalI wolf2 = factory.getWolf();
		wolf2.born();

		AnimalI pig2 = factory.getPig();
		pig2.born();
	}
}
