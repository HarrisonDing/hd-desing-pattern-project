package hd.dp.factorymethod.factory;

import hd.dp.factorymethod.entity.Beijing;
import hd.dp.factorymethod.entity.BornI;

public class CityFactory implements FactoryI {
	/* (non-Javadoc)
	 * @see hd.dp.factorymethod.factory.FactoryI#born()
	 */
	@Override
	public BornI born() {
		return new Beijing();
	}
}
