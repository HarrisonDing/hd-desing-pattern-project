package hd.dp.prototype;

<<<<<<< .mine
import java.util.ArrayList;
import java.util.List;

=======
import java.util.List;


>>>>>>> .theirs
/**
 * Prototype used when want to create a duplicated object, but may some
 * attributes may be updated later.
 * 
 * @author Harrison.Ding
 *
 */
public class SystemProto implements Cloneable {
	private String			name;
	private int				level;
	private List<String>	typeList;

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

	public SystemProto clone() {
		try {
			SystemProto systemProto = (SystemProto) super.clone();
			ArrayList<String> arrayList = new ArrayList<>();
			for (String type : this.getTypeList()) {
				arrayList.add(type);
			}
			systemProto.setTypeList(arrayList);
			return systemProto;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "SystemProto [name=" + name + ", level=" + level + ", typeList=" + typeList + "]";
	}

	public List<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
}
