package hd.dp.simplefactory.entity;

public class Banana implements FruitI {

	@Override
	public void create() {
		System.out.println("新出的香蕉");
	}
}
