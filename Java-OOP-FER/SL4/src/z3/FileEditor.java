package z3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileEditor {
	/**
	 * Reads input file encoded in UTF-8, process content and writes it to output
	 * file.
	 * 
	 * @param inputFile  input file
	 * @param outputFile output file
	 * @throws IOException
	 */
	public static void processFile(Path inputFile, Path outputFile) throws IOException {
		try (Scanner sc = new Scanner(inputFile.toFile(), StandardCharsets.UTF_8)) {
			FileOutputStream fos = new FileOutputStream(outputFile.toFile());
			while (sc.hasNext()) {
				String line = sc.nextLine();
				line.replaceAll("←↓", "↓");
				line.replaceAll("\r\n", "\n");
				line=line+"\n";
				byte[] bytes = line.getBytes();
				fos.write(bytes);
			}
			fos.close();
		}
	}

	public static void main(String[] args) throws IOException {
		Path inputFile = Path.of("C:\\Users\\9iang\\Desktop\\Semestar2\\OOP\\Kod\\SL4\\data\\exampleWindows.txt").toAbsolutePath();
		Path outputFile = Path.of("C:\\Users\\9iang\\Desktop\\Semestar2\\OOP\\Kod\\SL4\\data\\exampleLinux.txt").toAbsolutePath();
		FileEditor.processFile(inputFile, outputFile);
	}
}