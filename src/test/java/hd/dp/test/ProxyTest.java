package hd.dp.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import hd.dp.proxy.a.ProxySubject;
import hd.dp.proxy.b.ProxyHandler;
import hd.dp.proxy.subject.RealSubject;
import hd.dp.proxy.subject.Subject;

public class ProxyTest {

	@Test
	public void testProxyA() {
		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.sailBook();
	}

	@Test
	public void testProxyB() {
		System.out.println("\n=====================\nFrom testProxyB, ......................");
		RealSubject realSubject = new RealSubject();
		ProxyHandler proxyHandler = new ProxyHandler();
		proxyHandler.setProxyHandler(realSubject);

		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
				realSubject.getClass().getInterfaces(), proxyHandler);

		proxySubject.sailBook();
	}
}
