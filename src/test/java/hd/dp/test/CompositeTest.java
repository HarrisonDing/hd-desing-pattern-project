package hd.dp.test;

import java.util.List;

import org.junit.Test;

import hd.dp.composite.File;
import hd.dp.composite.Folder;
import hd.dp.composite.IFile;

public class CompositeTest {

	@Test
	public void testComposite() {
		Folder rootFolder = new Folder("level01");
		File aFile = new File("level01.txt");

		Folder nextFolder = new Folder("level02");
		File bFile = new File("level02.txt");

		nextFolder.add(bFile);

		rootFolder.add(nextFolder);
		rootFolder.add(aFile);
		displayTree(rootFolder, 0);
	}

	private void displayTree(IFile rootFolder, int deep) {
		for (int i = 0; i < deep; i++) {
			System.out.print("--");
		}
		rootFolder.display();
		List<IFile> children = rootFolder.getChildren();
		for (IFile file : children) {
			if (file instanceof File) {
				for (int i = 0; i <= deep; i++) {
					System.out.print("--");
				}
				file.display();
			} else {
				displayTree(file, deep + 1);
			}
		}
	}
}
