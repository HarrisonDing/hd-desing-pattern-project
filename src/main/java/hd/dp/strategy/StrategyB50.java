package hd.dp.strategy;

public class StrategyB50 implements Strategy {

	@Override
	public double feedback(double count) {
		return count * 0.5;
	}

}
