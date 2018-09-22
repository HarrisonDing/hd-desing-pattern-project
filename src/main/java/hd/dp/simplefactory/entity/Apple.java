package hd.dp.simplefactory.entity;

public class Apple implements FruitI {

	/* (non-Javadoc)
	 * @see hd.dp.simplefactory.entity.FruitI#create()
	 */
	@Override
	public void create() {
		System.out.println("新出的苹果");
	}
}
