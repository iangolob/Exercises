package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Translations {
	public static Map<String, Map<String, String>> load() throws IOException{
		//Scanner sc = new Scanner(p,StandardCharsets.UTF_8);
		Map<String,Map<String,String>> map = new HashMap<>();
		try(DirectoryStream<Path> ds = Files.newDirectoryStream(Path.of("data\\translations"))){
			for(Path p:ds) {
				String abbrev = p.getFileName().toString().substring(0,p.getFileName().toString().lastIndexOf('.'));
				map.put(abbrev, new TreeMap<>());
				Scanner sc = new Scanner(p,StandardCharsets.UTF_8);
				while(sc.hasNext()) {
					String[] line = sc.nextLine().split(":");
					map.get(abbrev).put(line[0], line[1]);
				}
			}
		}
		return map;
	}
	public static String translate(String countryName, String languageCode, Map<String,Map<String, String>> translations) {
			return translations.get(languageCode).getOrDefault(countryName,countryName);
	}
}
