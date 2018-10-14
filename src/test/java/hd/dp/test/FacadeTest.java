package hd.dp.test;

import org.junit.Test;

import hd.dp.facade.FacadeJijin;

public class FacadeTest {

	@Test
	public void testFacade() {
		FacadeJijin jijin = new FacadeJijin();
		jijin.buyA();

		System.out.println("Buy other again ...");

		jijin.buyB();
	}
}
