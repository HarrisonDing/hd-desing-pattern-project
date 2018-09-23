package hd.dp.factorymethod.factory;

import hd.dp.factorymethod.entity.BornI;
import hd.dp.factorymethod.entity.China;

public class NationFactory implements FactoryI {

	@Override
	public BornI born() {
		return new China();
	}

}
