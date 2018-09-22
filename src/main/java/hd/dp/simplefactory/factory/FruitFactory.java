package hd.dp.simplefactory.factory;

import hd.dp.simplefactory.entity.Apple;
import hd.dp.simplefactory.entity.Banana;
import hd.dp.simplefactory.entity.FruitI;

public class FruitFactory {

	public static FruitI getFruit(String type) {
		if (type.equalsIgnoreCase("apple")) {
			return new Apple();
		} else if (type.equalsIgnoreCase("banana")) {
			return new Banana();
		}

		return null;
	}
}
