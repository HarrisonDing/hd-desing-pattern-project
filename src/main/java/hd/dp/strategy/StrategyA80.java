package hd.dp.strategy;

public class StrategyA80 implements Strategy {

	@Override
	public double feedback(double count) {
		return count * 0.8;
	}

}
