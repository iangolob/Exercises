package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) throws IOException {
		JuryPoints.addPoints(0, null, args);
		DirectoryStream.Filter<Path> df;
		Path p;
		DirectoryStream<Path> ds = Files.newDirectoryStream(p,df);
	}

}
