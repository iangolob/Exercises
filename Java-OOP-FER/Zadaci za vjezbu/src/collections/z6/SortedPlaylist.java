package collections.z6;

import java.util.LinkedList;
import java.util.List;

import collections.z5.Playlist;
import collections.z5.Track;

public class SortedPlaylist extends Playlist{
	private boolean ascending=true;
	public SortedPlaylist(String name) {
		super(name);
	}
	public SortedPlaylist(String name,int limit) {
		super(name,limit);
	}
	@Override
	public void move(int position, int move) {
		throw new UnsupportedOperationException("Can't move position");
	}
}
