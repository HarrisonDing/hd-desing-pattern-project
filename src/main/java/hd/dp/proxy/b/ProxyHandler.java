package hd.dp.proxy.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import hd.dp.proxy.subject.RealSubject;

public class ProxyHandler implements InvocationHandler {

	private RealSubject subject;

	public void setProxyHandler(RealSubject realSubject) {
		this.subject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object res = null;
		promotion();

		res = method.invoke(subject, args);
		giveVip();
		return res;
	}

	public void promotion() {
		System.out.println("准备促销 。。。");
	}

	public void giveVip() {
		System.out.println("赠送VIP。。。");
	}

}
