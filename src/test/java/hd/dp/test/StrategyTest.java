package hd.dp.test;

import org.junit.Test;

import hd.dp.strategy.Context;
import hd.dp.strategy.StrategyA80;
import hd.dp.strategy.StrategyB50;

public class StrategyTest {

	@Test
	public void testStrategyA() {
		System.out.println("\nBegin test strategy A 80 ...");
		Context context = new Context(new StrategyA80());
		context.doStrategy(1000.0);
	}

	@Test
	public void testStrategyB() {
		System.out.println("\nBegin test strategy B 50 ...");
		Context context = new Context(new StrategyB50());
		context.doStrategy(1000.0);
	}
}
