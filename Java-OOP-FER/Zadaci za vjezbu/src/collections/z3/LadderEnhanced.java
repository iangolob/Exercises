package collections.z3;

import java.util.*;

import collections.z1.Ladder;

public class LadderEnhanced extends Ladder{
	private Map<String, Integer> wins=new HashMap<>();
	private Map<String, Integer> losses=new HashMap<>();
	public int wins(String player) {
		return wins.get(player);
	}
	public int losses(String player) {
		return losses.get(player);
	}
}
