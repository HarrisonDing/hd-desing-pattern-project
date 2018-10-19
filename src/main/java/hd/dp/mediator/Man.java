package hd.dp.mediator;

public class Man extends Person {

	public Man(String name, Integer quality, Mediator mediator) {
		super(name, quality, mediator);
	}

	@Override
	public void getPartner(Person person) {
		this.getMediator().setMan(this);
		this.getMediator().getPartner(person);
	}

}
