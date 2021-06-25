package collections.z1;

import java.util.*;

public class Ladder {
	private List<String> ladder = new LinkedList<>();
	private Set<String> playerSet = new HashSet<>();

	public Ladder() {

	}

	public Ladder(String... players) {
		this.join(players);
	}
	public void join(String... players) {
		for (String player : players) {
			if (playerSet.add(player))
				ladder.add(player);
		}
	}
	public int count() {
		return playerSet.size();
	}

	public Iterable<String> standings() {
		return ladder;
	}

	public void gameFinished(String winner, String looser) {
		int winner_pos = ladder.indexOf(winner);
		int looser_pos = ladder.indexOf(looser);
								
		if (winner_pos < looser_pos) {
			if (winner_pos != 0) {
				ladder.remove(winner_pos);
				ladder.add(winner_pos - 1, winner);
			}
		}			
		else {
			int move = (winner_pos - looser_pos) / 2;
			if (move != 0) {				
				ladder.remove(winner_pos);
				ladder.add(winner_pos - move, winner);
			}			
		}
		
		if (looser_pos != ladder.size() - 1) {
			ladder.remove(looser_pos);
			ladder.add(looser_pos + 1, looser);
		}
	}

}
