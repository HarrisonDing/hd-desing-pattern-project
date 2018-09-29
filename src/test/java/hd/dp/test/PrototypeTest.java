package hd.dp.test;

import org.junit.Test;

import hd.dp.prototype.SystemProto;

public class PrototypeTest {

	@Test
	public void testProtoType() {

		SystemProto systemProto = new SystemProto();
		systemProto.setLevel(1);
		systemProto.setName("Linux");
		systemProto.setType("Centos");

		SystemProto systemProto2 = systemProto.clone();
		systemProto.setName("Linux 32");

		System.out.println(systemProto);
		System.out.println(systemProto2);
	}

}
