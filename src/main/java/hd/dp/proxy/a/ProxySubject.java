package hd.dp.proxy.a;

import hd.dp.proxy.subject.Subject;

public class ProxySubject implements Subject {
	Subject subject;

	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void sailBook() {
		promotion();
		subject.sailBook();
		discount();
	}

	public void promotion() {
		System.out.println("准备促销 。。。");
	}

	public void discount() {
		System.out.println("打了几折。。。");
	}
}
