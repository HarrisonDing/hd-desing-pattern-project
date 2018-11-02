package hd.dp.state;

public class MState extends State {

	@Override
	public void doSomething(Person person) {
		if (person.getHour() == 6) {
			System.out.println("吃早餐");
		} else {
			person.setState(new LState());
			person.doSomething();
		}
	}

}
