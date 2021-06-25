package files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class PointsUtil {
	public static Map<String, Integer> getForYear(int year) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		Path p = Path.of("data\\" + year+"\\voting");
		if (Files.exists(p)) {
			try (DirectoryStream<Path> ds = Files.newDirectoryStream(p,new VotingFilter())) {
				for (Path fp : ds) {
					List<String> inputList = Files.readAllLines(fp,StandardCharsets.UTF_8);
					for (String s : inputList) {
						int points = Integer.parseInt(s.substring(0,2).trim());
						String country = s.substring(3);
						map.put(country, map.getOrDefault(country, 0) + points);
					}
				}
			}
		}
		return map;
	}
	public static Map<String, Integer> getForYear2(int year) throws IOException {

		Path p = Path.of("data\\" + year+"\\voting");
		EurovisionFileVisitor fv = new EurovisionFileVisitor();
		Files.walkFileTree(p, fv);
		return fv.getMap();
	}
}
