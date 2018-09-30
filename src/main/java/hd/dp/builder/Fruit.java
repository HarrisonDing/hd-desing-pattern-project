package hd.dp.builder;

public class Fruit {
	private String	plant;
	private int		water;
	private int		getherCount;

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getGetherCount() {
		return getherCount;
	}

	public void setGetherCount(int getherCount) {
		this.getherCount = getherCount;
	}

	@Override
	public String toString() {
		return "Fruit [plant=" + plant + ", water=" + water + ", getherCount=" + getherCount + "]";
	}
}
