package files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path>{
	private int level=0;
	public MyFileVisitor() {
		super();
	}
	@Override
	public FileVisitResult preVisitDirectory(Path p,BasicFileAttributes bfa) {
		try {
			Explorer.print(p, level, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		level++;
		return FileVisitResult.CONTINUE;
	}
	@Override
	public FileVisitResult visitFile(Path p,BasicFileAttributes bfa) {
		try {
			Explorer.print(p, level, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;
	}
	@Override
	public FileVisitResult postVisitDirectory(Path p,IOException e) {
		level--;
		return FileVisitResult.CONTINUE;
	}
}
