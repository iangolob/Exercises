package files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EurovisionFileVisitor extends SimpleFileVisitor<Path> {
	private final Map<String, Integer> map = new HashMap<>();

	public Map<String, Integer> getMap() {
		return map;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if (file.toString().endsWith(".txt")) {
			List<String> inputList;
			try {
				inputList = Files.readAllLines(file, StandardCharsets.UTF_8);
				for (String s : inputList) {
					int points = Integer.parseInt(s.substring(0, 2).trim());
					String country = s.substring(3);
					map.put(country, map.getOrDefault(country, 0) + points);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return FileVisitResult.CONTINUE;
	}
}
