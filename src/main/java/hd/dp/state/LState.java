package hd.dp.state;

public class LState extends State {

	@Override
	public void doSomething(Person person) {
		if (person.getHour() == 12) {
			System.out.println("吃午餐");
		} else {
			person.setState(new DState());
			person.doSomething();
		}
	}

}
