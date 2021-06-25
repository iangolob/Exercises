package collections2;

import java.awt.Color;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		Apartment apartment = new Apartment("Unska 2, 10000 Zagreb", 2);
		Room kitchen = new Room(FloorType.CERAMIC, 8.56, false, 1, Color.YELLOW);
		Room bathRoom = new BathRoom(true, 1, "shower", FloorType.CERAMIC, 7.28, true, 0, Color.BLUE);
		Room bedRoom1 = new Room(FloorType.HARDWOOD, 12.23, true, 1, Color.PINK);
		Room bedRoom2 = new Room(FloorType.HARDWOOD, 17.33, true, 2, Color.GREEN);
		Room livingRoom = new Room(FloorType.HARDWOOD, 20.08, true, 3, Color.ORANGE);
		apartment.addRooms(kitchen, bathRoom, bedRoom1, bedRoom2, livingRoom);
		System.out.println("Added room found: " + apartment.containsRoom(bedRoom2));
		System.out.println("Identical room found: "
				+ apartment.containsRoom(new Room(FloorType.HARDWOOD, 17.33, true, 2, Color.GREEN)));
		System.out.println("Almost identical room found: "
				+ apartment.containsRoom(new Room(FloorType.HARDWOOD, 18.01 - 0.68, true, 2, Color.GREEN)));
		System.out.println(
				apartment.containsRoom(new BathRoom(true, 1, "shower", FloorType.CERAMIC, 7.28, true, 0, Color.BLUE)));
		System.out.println(apartment.containsRoom(new BathRoom(false, 2, "bath",
				FloorType.CERAMIC, 7.28, true, 0, Color.BLUE)));
		for(Room room:apartment.getRooms())
			System.out.println(room.getNumberOfWindows());
	}

}
