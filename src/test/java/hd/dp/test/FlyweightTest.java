package hd.dp.test;

import org.junit.Test;

import hd.dp.flyweight.Student;
import hd.dp.flyweight.StudentFactory;

public class FlyweightTest {

	@Test
	public void testFlyweight() {
		StudentFactory studentFactory = new StudentFactory();
		Student student1 = studentFactory.getStudent(1234567890L);
		Student student2 = studentFactory.getStudent(1234567891L);
		Student student3 = studentFactory.getStudent(1234567890L);
		Student student4 = studentFactory.getStudent(1234567893L);

		if (student1 == student3) {
			System.out.println("They are the same object.");
		} else {
			System.out.println("They are different object.");
		}
	}
}
