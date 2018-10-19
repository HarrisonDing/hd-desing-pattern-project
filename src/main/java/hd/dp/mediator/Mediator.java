package hd.dp.mediator;

public class Mediator {
	private Man		man;
	private Woman	woman;

	public void setMan(Man man) {
		this.man = man;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}

	public void getPartner(Person person) {
		if (person instanceof Man) {
			setMan((Man) person);
		} else if (person instanceof Woman) {
			setWoman((Woman) person);
		}

		if (man == null || woman == null) {
			System.out.println("No, I am not a gay!");
		} else {
			if (man.getQuality() == woman.getQuality()) {
				System.out.println(man.getName() + "与" + woman.getName() + "绝配");
			} else {
				System.out.println(man.getName() + "与" + woman.getName() + "不相配");
			}
		}
	}
}
