package hd.dp.factorymethod.entity;

public class Beijing implements BornI {
	/* (non-Javadoc)
	 * @see hd.dp.factorymethod.entity.Born#born()
	 */
	@Override
	public void born() {
		System.out.println("Beijing born!");
	}
}
