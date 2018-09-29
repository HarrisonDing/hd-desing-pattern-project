package hd.dp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hd.dp.prototype.SystemProto;

public class PrototypeTest {

	@Test
	public void testProtoType() {

		SystemProto systemProto = new SystemProto();
		systemProto.setLevel(1);
		systemProto.setName("Linux");
		List<String> typelist = new ArrayList<>();
		typelist.add("Centos");
		typelist.add("32");

		systemProto.setTypeList(typelist);

		SystemProto systemProto2 = systemProto.clone();
		systemProto.setName("Linux 32");
		typelist.add("Arm");
		systemProto.setTypeList(typelist);

		System.out.println(systemProto);
		System.out.println(systemProto2);
	}

}
