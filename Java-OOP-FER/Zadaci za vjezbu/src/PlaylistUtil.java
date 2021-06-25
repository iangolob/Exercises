import java.util.*;

import collections.z5.Playlist;

public class PlaylistUtil {
	public Set<String> words(Playlist... playlists) {
		Set<String> words = new TreeSet<>();
		for (Playlist playlist : playlists) {
			String[] nameWords = playlist.getName().split(" ");
			for (String word : nameWords) {
				words.add(word);
			}
		}
		return words;
	}

	public Map<String, Integer> wordsOccurance(Playlist... playlists) {
		Map<String, Integer> map = new TreeMap<>();
		for (Playlist playlist : playlists) {
			for (int i = 1; i <= playlist.count(); i++) {
				String[] nameWords = playlist.trackAt(i).getName().split(" ");
				for (String word : nameWords) {
					if (map.get(word) == null) {
						map.put(word, 1);
					} else {
						map.put(word, map.get(word) + 1);
					}
				}
			}

		}
		return map;
	}

	public Map<Integer, Map<String, Integer>> perLength(Playlist... playlists) {
		Map<Integer, Map<String, Integer>> map = new TreeMap<>();
		for (Playlist playlist : playlists) {
			for (int i = 1; i <= playlist.count(); i++) {
				String[] nameWords = playlist.trackAt(i).getName().split(" ");
				for (String word : nameWords) {
					Map<String, Integer> tempMap = map.get(word.length());
					if (tempMap == null) {
						tempMap = new TreeMap<>();
					}
					tempMap.getOrDefault(word, 0);
					tempMap.put(word, tempMap.get(word) + 1);
				}
			}

		}
		return map;
	}

}
