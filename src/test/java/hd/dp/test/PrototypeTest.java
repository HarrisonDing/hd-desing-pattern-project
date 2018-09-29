package hd.dp.test;

import org.junit.Test;

import hd.dp.prototype.SystemProto;

public class PrototypeTest {

	@Test
	public void testProtoType() {
		SystemProto systemProto1 = new SystemProto();
		systemProto1.setLevel(1);
		systemProto1.setName("Windows");
		systemProto1.setType("Windows 7");

		SystemProto systemProto2 = new SystemProto();
		systemProto2.setLevel(1);
		systemProto2.setName("Linux");
		systemProto2.setType("Centos");

		System.out.println(systemProto1.getName());
		System.out.println(systemProto2.getName());
	}

}
