package hd.dp.state;

public class Person {
	private int		hour;
	private State	state;

	public Person() {
		state = new MState();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void doSomething() {
		this.state.doSomething(this);
		this.state = new MState();
	}
}
