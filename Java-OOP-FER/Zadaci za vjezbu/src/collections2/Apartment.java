package collections2;

import java.util.*;

public class Apartment {
	private Collection<Room> rooms;
	private String address;
	private int floor;

	public Apartment(String address, int floor) {
		Comparator<Room>  c= Comparator.comparing((r) -> r.getNumberOfWindows());
		rooms = new TreeSet<>(c);
		this.address = address;
		this.floor = floor;
	}

	public void addRooms(Room... rooms) {
		for (Room room : rooms)
			this.rooms.add(room);

	}

	public void removeRooms(Room... rooms) {
		for (Room room : rooms)
			this.rooms.remove(room);
	}

	public boolean containsRoom(Room room) {
		return rooms.contains(room);
	}

	public Iterator<Room> roomIterator() {
		return rooms.iterator();
	}

	public double getArea() {
		double totalArea = 0;
		for (Room room : rooms)
			totalArea += room.getArea();
		return totalArea;
	}
	public Collection<Room> getRooms(){
		return rooms;
	}
}
