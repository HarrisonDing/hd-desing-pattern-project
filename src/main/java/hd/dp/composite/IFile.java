package hd.dp.composite;

import java.util.List;

public interface IFile {

	void display();

	void add(IFile file);

	void remove(IFile file);

	List<IFile> getChildren();

}
