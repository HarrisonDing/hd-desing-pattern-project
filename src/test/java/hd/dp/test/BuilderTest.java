package hd.dp.test;

import org.junit.Test;

import hd.dp.builder.AppleBuilder;
import hd.dp.builder.FarmerWorking;

public class BuilderTest {

	@Test
	public void testBuilder() {
		AppleBuilder aBuilder = new AppleBuilder();
		FarmerWorking farmerWorking = new FarmerWorking();
		farmerWorking.buildFruit(aBuilder);

		System.out.println(aBuilder.getFruit());
	}
}
