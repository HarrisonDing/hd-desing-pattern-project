package hd.dp.builder;

public class AppleBuilder implements FruitBuilder {
	Fruit fruit = new Fruit();

	@Override
	public void plant() {
		System.out.println("播种 - 苹果树");
		fruit.setPlant("播种");
	}

	@Override
	public void water() {
		System.out.println("浇水 - 苹果树");
		fruit.setWater(100);
	}

	@Override
	public void gather() {
		System.out.println("采集 - 苹果树");
		fruit.setGetherCount(5000);
	}

	@Override
	public Fruit getFruit() {
		return fruit;
	}

}
