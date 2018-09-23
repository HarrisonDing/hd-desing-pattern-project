package hd.dp.abstractfactory.factory;

import hd.dp.abstractfactory.entity.AnimalI;

public interface AbstractFactoryI {
	// create pig instance
	AnimalI getPig();

	// create wolf instance
	AnimalI getWolf();
}
