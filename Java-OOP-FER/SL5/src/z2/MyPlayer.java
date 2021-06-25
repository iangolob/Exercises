package z2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.*;

public class MyPlayer extends Player implements Iterable<Game>{
	private Map<Game,List<Integer>> scores = new TreeMap<>(Comparator.comparing(Game::getName));
	protected MyPlayer(String name) {
		super(name);
	}

	@Override
	public Iterator<Game> iterator() {
		return scores.keySet().iterator();
	}

	@Override
	void addGameScore(Game game, int score) {
		scores.put(game, scores.getOrDefault(game, new LinkedList<>()));
		scores.get(game).add(score);
	}

	@Override
	Iterable<Integer> getScores(Game game) {
		return scores.get(game);
	}

}
