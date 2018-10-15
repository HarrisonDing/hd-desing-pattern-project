package hd.dp.composite;

import java.util.List;

public class File implements IFile {
	private String name;

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("file name: " + name);
	}

	@Override
	public void add(IFile file) {

	}

	@Override
	public void remove(IFile file) {

	}

	@Override
	public List<IFile> getChildren() {
		return null;
	}

}
