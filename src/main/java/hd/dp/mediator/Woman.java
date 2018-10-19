package hd.dp.mediator;

public class Woman extends Person {

	public Woman(String name, Integer quality, Mediator mediator) {
		super(name, quality, mediator);
	}

	@Override
	public void getPartner(Person person) {
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(person);
	}

}
