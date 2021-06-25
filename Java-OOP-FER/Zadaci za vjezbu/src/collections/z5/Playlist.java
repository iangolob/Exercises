package collections.z5;

import java.util.*;

public class Playlist {
	private String name;
	private List<Track> tracks = new LinkedList<>();
	private final OptionalInt lengthLimit;
	private int currentLength = 0;

	public Playlist(String name) {
		this.name = name;
		this.lengthLimit = OptionalInt.empty();
	}

	public Playlist(String name, int lengthLimit) {
		this.name = name;
		this.lengthLimit = OptionalInt.of(lengthLimit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean add(Track track) {
		if (lengthLimit.isPresent() && currentLength + track.getLength() > lengthLimit.getAsInt())
			return false;
		tracks.add(track);
		currentLength += track.getLength();
		return true;
	}

	public Track trackAt(int position) {
		return tracks.get(position - 1);
	}

	public void deleteAt(int position) {
		currentLength-=tracks.get(position).getLength();
		tracks.remove(position - 1);
	
	}

	public void move(int position, int move) {
		Track tempTrack = tracks.get(position-1);
		tracks.remove(position);
		tracks.add(position+move-1,tempTrack);
	}

	public int count() {
		return tracks.size();
	}

	public int duration() {
		return currentLength;
	}

	public void invert() {
		List<Track> tempList = new LinkedList<>();
		for (int i = tracks.size() - 1; i >= 0; i--) {
			tempList.add(tracks.get(i));
		}
		tracks = tempList;
	}
}
