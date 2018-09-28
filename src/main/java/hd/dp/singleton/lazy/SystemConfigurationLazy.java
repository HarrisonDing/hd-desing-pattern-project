package hd.dp.singleton.lazy;

public class SystemConfigurationLazy {
	private static SystemConfigurationLazy	instance	= null;
	private String							confPara;

	private SystemConfigurationLazy() {
	}

	public static SystemConfigurationLazy getInstance() {
		if (instance == null) {
			instance = new SystemConfigurationLazy();
		}
		return instance;
	}

	public String getConfPara() {
		return confPara;
	}

	public void setConfPara(String confPara) {
		this.confPara = confPara;
	}
}
