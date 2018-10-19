package hd.dp.test;

import org.junit.Test;

import hd.dp.mediator.Man;
import hd.dp.mediator.Mediator;
import hd.dp.mediator.Person;
import hd.dp.mediator.Woman;

public class MediatorTest {
	@Test
	public void testMediator() {
		Mediator mediator = new Mediator();
		Person zs = new Man("zhangsan", 10, mediator);
		Person ls = new Man("lisi", 9, mediator);
		Person xf = new Woman("xiaofang", 10, mediator);

		zs.getPartner(ls);
		zs.getPartner(xf);
		xf.getPartner(ls);
	}
}
