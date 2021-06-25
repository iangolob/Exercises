package z1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		JavaProjectFileVisitor visitor = new JavaProjectFileVisitor(Set.of(".pdf"));
		File f = new File("C:\\Users\\9iang\\Desktop\\Semestar1");
		Files.walkFileTree(f.toPath(), visitor);
		Map<String, Set<Path>> map = visitor.getProjectPathsPerExtension();
		for(String key : map.keySet()){
		  Set<Path> list = map.get(key);
		  for(Path p : list)
		    System.out.println("Key: " + key + " - " + p);
		}
	}

}
