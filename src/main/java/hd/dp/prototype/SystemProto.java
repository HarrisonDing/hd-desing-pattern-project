package hd.dp.prototype;

/**
 * Prototype used when want to create a duplicated object, but may some
 * attributes may be updated later.
 * 
 * @author Harrison.Ding
 *
 */
public class SystemProto {
	private String	name;
	private int		level;
	private String	type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
