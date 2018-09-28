package hd.dp.singleton.doublecheck;

public class SystemConfigurationDoubleCheck {
	private static SystemConfigurationDoubleCheck	instance	= null;
	private String									confPara;

	private SystemConfigurationDoubleCheck() {
	}

	/**
	 * Especially for multi thread case, it is most efficient and safe.
	 * 
	 * @return
	 */
	public static SystemConfigurationDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (SystemConfigurationDoubleCheck.class) {
				if (instance == null) {
					instance = new SystemConfigurationDoubleCheck();
				}
			}
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
