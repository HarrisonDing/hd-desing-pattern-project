package hd.dp.abstractfactory.factory;

import hd.dp.abstractfactory.entity.AnimalI;
import hd.dp.abstractfactory.entity.SouthPig;
import hd.dp.abstractfactory.entity.SouthWolf;

public class SouthFactory implements AbstractFactoryI {

	@Override
	public AnimalI getPig() {
		return new SouthPig();
	}

	@Override
	public AnimalI getWolf() {
		return new SouthWolf();
	}

}
