package hd.dp.test;

import org.junit.Test;

import hd.dp.adapter.Adapter;
import hd.dp.adapter.Current;

public class AdapterTest {
	@Test
	public void testAdapter() {
		Adapter adapter = new Adapter(new Current());
		adapter.use110v();
	}
}
