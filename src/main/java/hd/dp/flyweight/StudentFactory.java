package hd.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StudentFactory {
	private Map<Long, Student> stuMap = new HashMap<>();

	public Student getStudent(Long stuId) {
		Student student = stuMap.get(stuId);
		if (student == null) {
			student = new Student("Stu-01", 18, stuId);
			stuMap.put(stuId, student);
		}
		return student;
	}
}
