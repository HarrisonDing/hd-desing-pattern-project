package hd.dp.singleton.hungry;

public class SystemConfigurationHungry {
	private static SystemConfigurationHungry	instance	= new SystemConfigurationHungry();
	private String								confPara;

	private SystemConfigurationHungry() {
	}

	public static SystemConfigurationHungry getInstance() {
		return instance;
	}

	public String getConfPara() {
		return confPara;
	}

	public void setConfPara(String confPara) {
		this.confPara = confPara;
	}
}
