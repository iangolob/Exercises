package z1;

import java.nio.file.*;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
	private Map<String, Set<Path>> projectPathsPerExtension = new TreeMap<>();
	private Set<String> extensionFilter;
	public JavaProjectFileVisitor(Set<String> extensionFilter) {
		this.extensionFilter = extensionFilter;
	}

	public Map<String, Set<Path>> getProjectPathsPerExtension() {
		return projectPathsPerExtension;
	}
	@Override
	public FileVisitResult visitFile(Path p, BasicFileAttributes attrs) {
		if (!Files.isDirectory(p)) {
			String fileName = p.getFileName().toString();
			if(fileName.lastIndexOf('.')!=-1) {
				String extension = fileName.substring(fileName.lastIndexOf('.'));
				if (!extensionFilter.contains(extension)) {
					if (projectPathsPerExtension.get(extension) == null)
						projectPathsPerExtension.put(extension, new TreeSet<>());
					projectPathsPerExtension.get(extension).add(p);
				}
			}
				
			
		}
		return FileVisitResult.CONTINUE;
	}
}
