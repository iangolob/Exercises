package collections.z2;

import java.util.*;

import collections.z1.Ladder;

public class LadderUtil {
	public static Iterable<Pair<String>> randomDraw(Ladder ladder){
		LinkedList<String> players= new LinkedList<>();
		for(String player:ladder.standings()) {
			players.add(player);
		}
		Collections.shuffle(players);
		LinkedList<Pair<String>> draw= new LinkedList<>();
		for(int i=0;i<players.size();i+=2) {
			String player1=players.get(i);
			String player2;
			if(players.size()==i+1) {
				player2="FREE";
			}else {
				player2=players.get(i+1);
			}
			draw.add(new Pair<>(player1,player2));
		}
		return draw;
	}
}
