package files;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileFilter implements Filter<Path>{

	@Override
	public boolean accept(Path entry) throws IOException {
		if(entry.toString().endsWith(".dll") || Files.isDirectory(entry)) 
			return true;
		return false;
	}

}
