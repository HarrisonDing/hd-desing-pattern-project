package hd.dp.strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void doStrategy(double count) {
		System.out.println("Current strategy, target feedback: " + this.strategy.feedback(count));
	}
}
