package hd.dp.test;

import org.junit.Test;

import hd.dp.state.Person;

public class StateTest {

	@Test
	public void testState() {
		Person person = new Person();
		person.setHour(6);
		person.doSomething();

		person.setHour(12);
		person.doSomething();

		person.setHour(18);
		person.doSomething();

		person.setHour(19);
		person.doSomething();

		person.setHour(6);
		person.doSomething();
	}
}
