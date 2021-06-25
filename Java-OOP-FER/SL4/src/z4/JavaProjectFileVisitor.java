package z4;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
	private Map<String,Long> extensionData = new HashMap<>();
	public Map<String, Long> getProjectFileSizeInfo(){
		return extensionData;
	}
	@Override
	public FileVisitResult visitFile(Path p, BasicFileAttributes attr) {
		if(!Files.isDirectory(p)) {
			try {
				long size = Files.size(p);
				String extension = p.toString().substring(p.toString().lastIndexOf('.'));
				extensionData.put(extension, extensionData.getOrDefault(extension, 0L)+size);
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		return FileVisitResult.CONTINUE;
	}
}
