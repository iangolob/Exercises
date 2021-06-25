package collections.z5;

public class Track {
	private final String name;
	private final String artist;
	private final int length;
	public Track(String name, String artist, int length) {
		this.name=name;
		this.artist=artist;
		this.length=length;
	}
	@Override
	public String toString() {
		return artist+": "+name;
	}
	public String getName() {
		return name;
	}
	public String getArtist() {
		return artist;
	}
	public int getLength() {
		return length;
	}
	
}
