package hd.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile {
	private String		name;
	private List<IFile>	children;

	public Folder(String name) {
		super();
		this.name = name;
		children = new ArrayList<IFile>();
	}

	@Override
	public void display() {
		System.out.println("Folder name: " + name);
	}

	@Override
	public void add(IFile file) {
		children.add(file);
	}

	@Override
	public void remove(IFile file) {
		children.remove(file);
	}

	@Override
	public List<IFile> getChildren() {
		return children;
	}

}
