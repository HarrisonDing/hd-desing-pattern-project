package hd.dp.flyweight;

public class Student extends Person {
	private Long stuId;

	public Student(String name, Integer age, Long stuId) {
		super(name, age);
		this.stuId = stuId;
	}

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}
}
