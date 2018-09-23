package hd.dp.test;

import org.junit.Test;

import hd.dp.factorymethod.factory.CityFactory;
import hd.dp.factorymethod.factory.FactoryI;
import hd.dp.factorymethod.factory.NationFactory;

public class FactoryMethodTest {

	@Test
	public void testFactoryMethod() {
		FactoryI factory = new CityFactory();
		factory.born().born();

		factory = new NationFactory();
		factory.born().born();
	}
}
