package hd.dp.mediator;

public abstract class Person {
	private String		name;
	private Integer		quality;
	private Mediator	mediator;

	public Person(String name, Integer quality, Mediator mediator) {
		super();
		this.name = name;
		this.quality = quality;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public abstract void getPartner(Person person);

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}
