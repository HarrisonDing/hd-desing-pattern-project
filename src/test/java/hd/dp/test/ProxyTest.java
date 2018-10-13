package hd.dp.test;

import org.junit.Test;

import hd.dp.proxy.a.ProxySubject;
import hd.dp.proxy.a.RealSubject;

public class ProxyTest {

	@Test
	public void testProxyA() {
		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.sailBook();

	}
}
