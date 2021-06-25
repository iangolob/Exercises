package files;

import java.io.IOException;
import java.nio.file.*;

public class Explorer {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("data");

		Explorer e1 = new Explorer();
		e1.goAround(p, 0);
		Explorer e2 = new Explorer();
		//e2.goAround2(p);
	}

	public void goAround(Path path, int level) {
		DirectoryStream.Filter<Path> dsf = new MyFileFilter();
		try (DirectoryStream<Path> ds = Files.newDirectoryStream(path,dsf)) {
			for (Path p : ds) {
				if (Files.isDirectory(p)) {
					print(p, level, true);
					goAround(p, level + 1);
				} else {
					print(p, level, false);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void print(Path p, int level, boolean isDirectory) throws IOException {
		System.out.print("|");
		String name = p.getFileName().toString();
		if (isDirectory) {
			for (int i = 0; i < level; i++)
				System.out.print("-");
			System.out.println(name);
		} else {
			for (int i = 0; i < level; i++)
				System.out.print(" ");
			System.out.format("%s (%d bytes)%n", name, Files.size(p));
		}	
	}
	public void goAround2(Path p) throws IOException {
		FileVisitor<Path> fv= new MyFileVisitor();
		
		Files.walkFileTree(p,fv);
		
	}

}
