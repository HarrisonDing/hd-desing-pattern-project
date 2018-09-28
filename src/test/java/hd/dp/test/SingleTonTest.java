package hd.dp.test;

import org.junit.Test;

import hd.dp.singleton.doublecheck.SystemConfigurationDoubleCheck;
import hd.dp.singleton.hungry.SystemConfigurationHungry;
import hd.dp.singleton.lazy.SystemConfigurationLazy;

public class SingleTonTest {

	@Test
	public void testHungry() {
		SystemConfigurationHungry instance1 = SystemConfigurationHungry.getInstance();
		instance1.setConfPara("Mine");

		SystemConfigurationHungry instance2 = SystemConfigurationHungry.getInstance();
		instance2.setConfPara("Yours");

		System.out
				.println("Hungry => Instance1: " + instance1.getConfPara() + ", instance2: " + instance2.getConfPara());
	}

	@Test
	public void testLazy() {
		SystemConfigurationLazy instance1 = SystemConfigurationLazy.getInstance();
		instance1.setConfPara("Mine");

		SystemConfigurationLazy instance2 = SystemConfigurationLazy.getInstance();
		instance2.setConfPara("Yours");

		System.out.println("Lazy => Instance1: " + instance1.getConfPara() + ", instance2: " + instance2.getConfPara());
	}

	@Test
	public void testDoubleCheck() {
		SystemConfigurationDoubleCheck instance1 = SystemConfigurationDoubleCheck.getInstance();
		instance1.setConfPara("Mine");

		SystemConfigurationDoubleCheck instance2 = SystemConfigurationDoubleCheck.getInstance();
		instance2.setConfPara("Yours");

		System.out.println("Lazy => Instance1: " + instance1.getConfPara() + ", instance2: " + instance2.getConfPara());
	}

}
