package hd.dp.abstractfactory.factory;

import hd.dp.abstractfactory.entity.AnimalI;
import hd.dp.abstractfactory.entity.NorthPig;
import hd.dp.abstractfactory.entity.NorthWolf;

public class NorthFactory implements AbstractFactoryI {

	@Override
	public AnimalI getPig() {
		return new NorthPig();
	}

	@Override
	public AnimalI getWolf() {
		return new NorthWolf();
	}

}
